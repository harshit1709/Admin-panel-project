package com.project.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.project.model.Student;
import com.project.project.repository.StudentRepo;
import com.project.project.repository.StudentSearchRepo;

@Controller
//@RequestMapping("/Api")
public class StudentController {
	@Autowired
	StudentRepo studentrepo;
	@Autowired
	StudentSearchRepo studentSearchRepo;
	@PostMapping("/Add-Student")
	public String AddStudent(@RequestParam String RollNo,@RequestParam String name,@RequestParam String batch,@RequestParam String email,@RequestParam String mobile,@RequestParam String gender,@RequestParam String DOB,@RequestParam String AdmissionDate,Model model){
//		try {
//			Student sRef = studentrepo.save(new Student(RollNo, name, batch, email, mobile, gender, DOB, AdmissionDate));
//			return new ResponseEntity<Student>(sRef, HttpStatus.CREATED);
//		}catch(Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		studentrepo.save(new Student(RollNo, name, batch, email, mobile, gender, DOB, AdmissionDate));
		model.addAttribute("studentlist", studentrepo.findAll());
		return "Student";
		
	}
	@RequestMapping("/Student")
	public String Student(Model model) {
		model.addAttribute("studentlist", studentrepo.findAll());
		return "Student";
	}
	
	 @RequestMapping("/search")
	    public String search(Model model, @RequestParam String search) {
		 
	        model.addAttribute("studentlist", studentSearchRepo.searchStudent(search));
	        model.addAttribute("search", search);
	        return "Student";
	    }
	

}
