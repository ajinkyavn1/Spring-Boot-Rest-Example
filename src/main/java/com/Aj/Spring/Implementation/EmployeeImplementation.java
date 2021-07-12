package com.Aj.Spring.Implementation;

import com.Aj.Spring.Model.Employe;
import com.Aj.Spring.Repository.EmployeRepo;
import com.Aj.Spring.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
public class EmployeeImplementation implements EmployeeService {

    @Autowired
    private EmployeRepo employeRepo;
    @Override
    public Employe SaveEmploye(Employe employe) {
        return employeRepo.save(employe);
    }
}
