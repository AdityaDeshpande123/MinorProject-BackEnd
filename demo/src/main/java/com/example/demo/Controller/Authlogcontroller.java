package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Authlogin;
import com.example.demo.Repo.Authlogrepo;

@RestController
@CrossOrigin("http://localhost:3000/")
public class Authlogcontroller {
	
	@Autowired
	private Authlogrepo myrepo;
	
	@GetMapping("/getauthor/{email}")
	public Authlogin getauthors(@PathVariable String email)
	{
		System.out.println("Retriving details about author : "+email);
		return myrepo.findById(email).orElse(null);
	}

}
