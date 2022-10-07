package com.Student.client;

import com.Student.entity.Student;
import com.Student.services.StudentService;
import com.Student.services.StudentServiceImpl;

public class client {
	public static void main(String[] args) 
	{		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		
	//student.setStudentid(109);
	//student.setName("Vikas");
	//service.addStudent(student);
		
		
	// Retrieve Operation
	//	service.findStudentById(104);
		//System.out.println("ID is: "+student.getStudentid());
		//System.out.println("Name is: "+student.getName());
		
		
		
		//Update Operation
		//student  =service.findStudentById(1);
		//student.setName("Avantika ");
		//service.updateStudent(student);
		
		
		//service.findStudentById(101);
		//System.out.println("ID is: "+student.getStudentid());
		//System.out.println("Name is: "+student.getName());
		
		
		// Delete Operation
		student=service.findStudentById(109);
		service.removeStudent(student);
		System.out.println("Row removed");
		
		System.out.println("End of the Program/Life cycle completed...");
	}
}
