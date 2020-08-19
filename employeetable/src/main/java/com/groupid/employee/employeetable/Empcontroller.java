package com.groupid.employee.employeetable;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Empcontroller {
	@Autowired
	Empservice employeeservice;
	@RequestMapping("/new")
	   public ModelAndView index(Model model)
	{
	       Emp employee = new Emp();
             model.addAttribute("employee",employee);
	        return new ModelAndView("saveemployee");
		
	}
	@RequestMapping("/save")
	public ModelAndView saveProduct( Emp employee) {
	    employeeservice.save(employee);
	     
	    return new ModelAndView("index");
	}
	@RequestMapping("/show")
	public ModelAndView viewHomePage(Model model) {
	    List<Emp> employee = employeeservice.listAll();
	    model.addAttribute("employee",employee);
	     
	    return new ModelAndView("showemployees");
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") Integer id) {
		
	    ModelAndView mav = new ModelAndView("editemployee");
	    Emp employee = employeeservice.get(id);
	    mav.addObject("employee", employee);
	     
	    return mav;
	}
	  @GetMapping("/delete/{id}")
	    public ModelAndView deleteEmployee(@PathVariable(value = "id") Integer id) {

	        // call delete employee method 
	        employeeservice.deleteEmployeeById(id);
	       
	        return new ModelAndView("index");
	    }
}
