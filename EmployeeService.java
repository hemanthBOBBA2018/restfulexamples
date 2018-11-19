package com.chilly.service;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.chilly.dao.EmployeeDAO;
import com.chilly.model.Employee;
import com.owlike.genson.Genson;

@Path("/Employees")
public class EmployeeService {
	private EmployeeDAO employeeDAO = new EmployeeDAO();
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getAllEmployees(){
        List<Employee> emps = employeeDAO.getAllEmployees(); 
        Genson genson = new Genson();
        return genson.serialize(emps); 
    }

}
