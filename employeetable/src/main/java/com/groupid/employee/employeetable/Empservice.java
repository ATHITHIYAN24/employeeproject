package com.groupid.employee.employeetable;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class Empservice {

	
	@Autowired
	 private Emprepository employeerepository;
    
	  public void save(Emp employee) {
	        employeerepository.save(employee);
	    }

	public List<Emp> listAll() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

	public Emp get(Integer id) {
		// TODO Auto-generated method stub
		return employeerepository.findOne(id);
	}

	public void deleteEmployeeById(Integer id) {
		employeerepository.delete(id);
		 System.out.println("DELETED SUCCESSFULLY");
		
	}
}
