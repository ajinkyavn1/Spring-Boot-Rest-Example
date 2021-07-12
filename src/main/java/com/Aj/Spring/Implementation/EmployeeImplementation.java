package com.Aj.Spring.Implementation;

import com.Aj.Spring.Exception.ResourceNotFoundException;
import com.Aj.Spring.Model.Employe;
import com.Aj.Spring.Repository.EmployeRepo;
import com.Aj.Spring.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Employe> getAllEmployee() {
        return  employeRepo.findAll();
    }

    @Override
    public Employe getEmployeeByid(long id) {
//        Optional<Employe> employe=employeRepo.findById(id);
//        if(employe.isPresent())
//            return employe.get();
//        else
//            throw new ResourceNotFoundException("Employee","ID",id);
        return employeRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee","ID",id));
    }
}
