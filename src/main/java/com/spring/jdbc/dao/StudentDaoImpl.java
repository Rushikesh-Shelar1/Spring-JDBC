package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		
		String query="insert into student1(id,name,city) value(?,?,?)";
		int r=this.jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity());
		return r;
	}

	@Override
	public int change(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
