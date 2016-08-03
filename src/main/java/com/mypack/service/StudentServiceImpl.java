package com.mypack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypack.dao.StudentDAO;
import com.mypack.dto.StudentDTO;

@Service ("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO dao;
	public StudentDTO createNewStudent() {
		return dao.createNewStudent();
	}
}
