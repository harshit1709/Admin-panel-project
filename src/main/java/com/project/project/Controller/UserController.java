package com.project.project.Controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.bson.Document;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.project.project.model.User;
import com.project.project.repository.BatchRepo;
import com.project.project.repository.StaffRepo;
import com.project.project.repository.StudentRepo;
import com.project.project.repository.UserRepo;

@Controller
@RequestMapping("/auth")
public class UserController {
	@Autowired
	UserRepo userrepo;
	@Autowired
	StudentRepo studentrepo;
	@Autowired
	StaffRepo staffrepo;
	@Autowired
	BatchRepo batchrepo;
	boolean flag = false;
	
//	MongoClient mongoClient;
	@RequestMapping("/Dashboard")
	public String Login(@RequestParam String email, @RequestParam String password, HttpSession session ,Model model){
		User user3 = new User(email , password);
		User user2 = new User("admin@example.com", "admin");
		
		
		
		
//		Optional<User> user = userrepo.findById(email);
//		Optional<User> user1 = userrepo.findById(password);
		
//		MongoDatabase database = mongoClient.getDatabase("LMS");
//        MongoCollection<Document> collection = database.getCollection("users");
//        Document document = collection.find(Filters.eq("email",user3.email)).first();
//        
//        if(document.getString("password").equals(user3.password)) {
//        	return "Dashboard";
//        }else {
//        	model.addAttribute("email", user3.email);
//        	return "error";
//        }
//		if(flag = true) {
//			return "Dashboard";
//		}
		
		if(user3.email.equals(user2.email) && user3.password.equals(user2.password)) {
			flag = true;
			session.setAttribute("email", email);
			model.addAttribute("Studentcount",studentrepo.count());
			model.addAttribute("Staffcount",staffrepo.count());
			model.addAttribute("Batchcount",batchrepo.count());
			return "Dashboard";
		}else {
			model.addAttribute("email", user3.email);
			return "error";
		}
		

	}

	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("email");
		return "redirect:/";
	}
	

}
