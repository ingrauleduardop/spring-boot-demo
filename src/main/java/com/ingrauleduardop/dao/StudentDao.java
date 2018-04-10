package com.ingrauleduardop.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ingrauleduardop.entity.Student;

@Repository
public class StudentDao {

	private static Map<Integer, Student> students;
	
	static {
		students = new HashMap<Integer, Student>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(1, new Student(1, "Raul", "Machine Learning"));
				put(2, new Student(2, "Eduardo", "Business Intelligence"));
			}
		};		
	}
	
	public Collection<Student> getAllStudents(){
		return students.values();
	}
	
	public Student getStudentById(int id) {
		return students.get(id);
	}

	public void deleteStudentById(int id) {
		students.remove(id);		
	}
	
	public void updateStudent(Student student) {
		students.get(student.getId()).setName(student.getName());		
		students.get(student.getId()).setCourse(student.getCourse());
	}
	
	public void insertStudent(Student student) {
		students.put(student.getId(), student);		
	}
}
