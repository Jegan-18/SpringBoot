package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {
	
	@GetMapping
	public List<Student> getStudents() {
		return List.of(
				new Student(1,"Jegan","jegan@gmail.com",LocalDate.of(2000,03,18),21)
						
				 );
				      
	}


}
