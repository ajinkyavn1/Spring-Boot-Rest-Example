package com.Aj.Spring.Controllar;

import com.Aj.Spring.Model.Employe;
import com.Aj.Spring.Service.EmployeeService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/api/employee")
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
    @GetMapping()
    public List<Employe> getAllEmployee(){
        return  employeeService.getAllEmployee();
    }
    @GetMapping("{id}")
    public  ResponseEntity<Employe> getEmployeeById(@PathVariable("id") long id){
        return  new ResponseEntity<Employe>(employeeService.getEmployeeByid(id),HttpStatus.OK);


    }
    @PutMapping("{id}")
    public  ResponseEntity<Employe> updateEmployee(@PathVariable("id") long id,@RequestBody Employe employe){
        return  new ResponseEntity<Employe>(employeeService.UpdateEmployee(employe,id),HttpStatus.OK);


    }
    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteEmploye(@PathVariable("id") long id){
        employeeService.deleteEmployee(id);
        return  new ResponseEntity<String>("<script>alert('Deleted Sucesfully')</script>",HttpStatus.OK);
    }
}
