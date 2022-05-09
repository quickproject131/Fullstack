package com.backend.serviceimpl;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.DBUtil.Connection;
import com.backend.entites.Student;
import com.backend.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	List<Student> studentist = new ArrayList();
	
	Connection connection;
	public StudentServiceImpl()
	{
		connection = Connection.getConnection();
	}
	
	@Override
	public List<Student> getStudents() {
	
//		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM STUDNETS");
		return null;
	}

}
