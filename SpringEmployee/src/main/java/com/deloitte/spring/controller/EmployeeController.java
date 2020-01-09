package com.deloitte.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deloitte.spring.dao.EmployeeDAO;
import com.deloitte.spring.entity.Employee;

@Controller
public class EmployeeController {
	EmployeeDAO edao;

	@Autowired
	EmployeeController(EmployeeDAO edao) {
		this.edao = edao;
	}

	@GetMapping("/empPage")
	public String getEmpPage(Model model) {
		model.addAttribute("emp", new Employee(0, "", 0.0));
		return "DisplayEmployee";
	}

	@GetMapping("/empCRUD")
	public String empCrud(@RequestParam("sub") String sub,@RequestParam("empid")int empid,@RequestParam("name") String name
			,@RequestParam("salary")double salary,RedirectAttributes ra) {
		ra.addFlashAttribute("emp",new Employee(empid,name,salary));
		String val = "";
		if (sub.equals("Add_Employee"))
			val = "addEmployee";
		else if (sub.equals("Delete_Employee"))
			val = "deleteEmployee";
		else if (sub.equals("Modify_Employee"))
			val = "updateEmployee";
		else
			val = "getEmployee";

		return "redirect:" + val;
	}

	@GetMapping("/addEmployee")
	public String addEmployee(@ModelAttribute("emp") Employee e) {
		edao.insertEmployee(e);
		return "DisplayEmployee";
	}

	@GetMapping("/updateEmployee")
	public String updateEmployee(@ModelAttribute("emp") Employee e) {
		edao.updateEmployee(e);
		return "DisplayEmployee";
	}

	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@ModelAttribute("emp") Employee e) {
		edao.deleteEmployee(e.getEmpid());
		return "DisplayEmployee";
	}

	@GetMapping("/getEmployee")
	public String getEmployee(@ModelAttribute("emp") Employee e,Model model) {
		Employee e1 = edao.getEmployee(e.getEmpid());
		model.addAttribute("emp",e1);
		return "DisplayEmployee";
	}
}
