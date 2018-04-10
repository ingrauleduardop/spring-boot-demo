package com.ingrauleduardop.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingrauleduardop.dao.StudentDao;
import com.ingrauleduardop.entity.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
	}

	public void deleteStudentById(int id) {
		studentDao.deleteStudentById(id);
	}
	
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}
	
	public void insertStudent(Student student) {
		studentDao.insertStudent(student);	
	}
}
