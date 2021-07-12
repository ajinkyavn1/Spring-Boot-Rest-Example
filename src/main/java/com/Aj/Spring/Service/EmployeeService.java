package com.Aj.Spring.Service;

import com.Aj.Spring.Model.Employe;

import java.util.List;

public interface EmployeeService {
    Employe saveEmployee(Employe employe);
    List<Employe> getAllEmployee();
    Employe getEmployeeByid(long id);
    Employe UpdateEmployee(Employe employe,long id);
    void deleteE
}
