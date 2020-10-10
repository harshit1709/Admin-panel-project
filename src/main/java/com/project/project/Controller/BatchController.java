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

import com.project.project.model.Batches;

import com.project.project.repository.BatchRepo;


@Controller
public class BatchController {
	
	@Autowired
	BatchRepo batchrepo;
	
	@PostMapping("/Add-Batch")
	public String AddStaff(@RequestParam String batchname, @RequestParam String batchyear, @RequestParam String feePerStudent, @RequestParam String noOfStudent, @RequestParam String feeStatus, @RequestParam String handeledBy, Model model){
//		try {
//			Staff sRef = staffrepo.save(new Staff(name,  designation, department, email, password, mobile, gender, DOB));
//			return new ResponseEntity<Staff>(sRef, HttpStatus.CREATED);
//		}catch(Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		batchrepo.save(new Batches(batchname, batchyear, feePerStudent, noOfStudent, feeStatus, handeledBy));
		model.addAttribute("batchlist", batchrepo.findAll());
		return "Batches";
	}

	
	@RequestMapping("/Batches")
	public String Staff(Model model) {
		model.addAttribute("batchlist", batchrepo.findAll());
		return "Batches";
	}
}
