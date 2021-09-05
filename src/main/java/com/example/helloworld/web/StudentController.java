package com.example.helloworld.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.example.helloworld.domain.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/student")
	public String messages(Model model) {
		Student student1 = new Student("Kate", "Cole");
		Student student2 = new Student("Dan", "Brown");
		Student student3 = new Student("Mike", "Mars");
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		model.addAttribute("students", students);
		return "studentlist";
	}
}