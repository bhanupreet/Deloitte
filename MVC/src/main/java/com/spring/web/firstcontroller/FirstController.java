package com.spring.web.firstcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.web.firstcontroller.dao.UsersDAO;

@Controller
public class FirstController {

	UsersDAO udao;

	@Autowired
	FirstController(UsersDAO udao) {
		this.udao = udao;
	}

	@GetMapping("/disp")
	public String getDisplay() {
		return "Display";
	}

	@PostMapping("/validateLogin")
	public String authenticateLogin(@RequestParam("uid") String username, @RequestParam("pwd") String password,
			Model model) {
		String message = "";
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		SessionFactory factory = cfg.buildSessionFactory();
//		udao = new UsersDAO(factory);
		if (udao.validateUser(username, password))
			message = "Welcome";
		else
			message = "Invalid Username/password";
		model.addAttribute("message", message);
		return "Display";
	}
}
