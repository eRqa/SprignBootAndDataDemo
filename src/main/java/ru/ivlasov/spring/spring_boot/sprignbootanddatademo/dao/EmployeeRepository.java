package ru.ivlasov.spring.spring_boot.sprignbootanddatademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivlasov.spring.spring_boot.sprignbootanddatademo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
