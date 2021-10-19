package ru.ivlasov.spring.spring_boot.sprignbootanddatademo.service;

import ru.ivlasov.spring.spring_boot.sprignbootanddatademo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee e);

    public Employee findEmployeeById(int id);

    public void deleteEmployee(int id);

}
