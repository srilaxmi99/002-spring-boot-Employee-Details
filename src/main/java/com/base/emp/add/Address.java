package com.base.emp.add;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import com.base.emp.emp.Employee;

@Component("add")
public class Address {
	@Value("aswaraopet")
	private String vname;
	@Value("hyderabad")
	private String city;
	
	@Autowired
	private Employee employee;
	
	@Override
	public String toString() {
		
		return "Address [vname ="+vname+",city="+ city +",employee=" + employee +"]";

	

	}

}
