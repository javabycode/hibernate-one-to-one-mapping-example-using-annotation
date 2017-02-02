package com.javabycode.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.javabycode.hibernate.model.StudentDetail;
import com.javabycode.hibernate.model.Student;

public class HibernateExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Student student = new Student("David Pham", new Date(), "USA", "1234569");

		StudentDetail studentDetail = new StudentDetail("David", "Pham", "Male", "High School", "70xx Silver street",
				"USA", "10001");

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		session.save(student);

		studentDetail.setId(student.getId());
		student.setStudentDetail(studentDetail);
		session.save(student);

		session.getTransaction().commit();
		session.flush();
		
		List<Student> students = (List<Student>) session.createQuery("from Student ").list();
		for (Student s : students) {
			System.out.println("Student : " + s);
		}

		List<StudentDetail> studentDetails = (List<StudentDetail>) session.createQuery("from StudentDetail ").list();
		for (StudentDetail std : studentDetails) {
			System.out.println("Student Detail: " + std);
		}

		session.close();
		System.exit(0);
	}
}
