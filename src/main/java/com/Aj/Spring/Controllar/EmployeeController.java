package com.Aj.Spring.Controllar;

import com.Aj.Spring.Model.Employe;
import com.Aj.Spring.Service.EmployeeService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {


    private EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        super();
       this.employeeService = employeeService;
    }
    @PostMapping()
    public ResponseEntity<Employe> saveEmployee(@RequestBody Employe employe) {
        return  new ResponseEntity<Employe>(employeeService.saveEmployee(employe), HttpStatus.CREATED);
    }
}
