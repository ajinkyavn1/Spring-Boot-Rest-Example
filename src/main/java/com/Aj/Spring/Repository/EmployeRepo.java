package com.Aj.Spring.Repository;

import com.Aj.Spring.Model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepo extends JpaRepository<Employe,Long> {
}
