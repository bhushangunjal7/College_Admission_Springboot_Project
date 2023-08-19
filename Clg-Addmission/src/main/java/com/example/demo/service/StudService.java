package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudRepository;

@Service
public class StudService {

	@Autowired
	private StudRepository repo;
	public void addStud(Student s) {
		repo.save(s);
	}
	public List<Student> getAllStud(){
		return repo.findAll();
	}
}
