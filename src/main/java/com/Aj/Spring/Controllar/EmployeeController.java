package com.Aj.Spring.Controllar;

import com.Aj.Spring.Repository.EmployeRepo;
import com.Aj.Spring.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService EmployeeService;


}
