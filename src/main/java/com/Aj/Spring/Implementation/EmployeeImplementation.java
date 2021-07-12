package com.Aj.Spring.Implementation;

import com.Aj.Spring.Model.Employe;
import com.Aj.Spring.Repository.EmployeRepo;
import com.Aj.Spring.Service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImplementation implements EmployeeService {

    private EmployeRepo employeRepo;

    public EmployeeImplementation(EmployeRepo employeRepo) {
        super();
        this.employeRepo = employeRepo;
    }

    @Override
    public Employe saveEmployee(Employe employe) {

        return employeRepo.save(employe);
    }
}
