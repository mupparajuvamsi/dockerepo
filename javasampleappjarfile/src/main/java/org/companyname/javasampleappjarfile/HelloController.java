package org.companyname.javasampleappjarfile;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/getAllGoodStudents")
	public ArrayList<String> getAllGoodStudents() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("venkatesh");
		arrayList.add("manohar");
		return arrayList;
	}

}