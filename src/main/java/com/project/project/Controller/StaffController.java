package com.project.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.project.model.Staff;
import com.project.project.repository.StaffRepo;

@Controller
//@RequestMapping("/Api")
public class StaffController {
	@Autowired
	StaffRepo staffrepo;
	
	@PostMapping("/Add-Staff")
	public String AddStaff(@RequestParam String name, @RequestParam String designation, @RequestParam String department, @RequestParam String email, @RequestParam String password, @RequestParam String mobile, @RequestParam String gender, @RequestParam String DOB, Model model){
//		try {
//			Staff sRef = staffrepo.save(new Staff(name,  designation, department, email, password, mobile, gender, DOB));
//			return new ResponseEntity<Staff>(sRef, HttpStatus.CREATED);
//		}catch(Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		staffrepo.save(new Staff(name,  designation, department, email, password, mobile, gender, DOB));
		model.addAttribute("stafflist", staffrepo.findAll());
		return "Staff";
		
		
		
	}
	@RequestMapping("/Staff")
	public String Staff(Model model) {
		model.addAttribute("stafflist", staffrepo.findAll());
		return "Staff";
	}

}

