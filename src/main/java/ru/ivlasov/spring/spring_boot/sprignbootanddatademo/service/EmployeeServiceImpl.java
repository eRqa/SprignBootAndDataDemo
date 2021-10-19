package ru.ivlasov.spring.spring_boot.sprignbootanddatademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ivlasov.spring.spring_boot.sprignbootanddatademo.dao.EmployeeRepository;
import ru.ivlasov.spring.spring_boot.sprignbootanddatademo.entity.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee e) {
        employeeRepository.save(e);
    }

    @Override
    public Employee findEmployeeById(int id) {
        Employee e = null;
        Optional<Employee> optEmployee = employeeRepository.findById(id);
        if (optEmployee.isPresent()) {
            e = optEmployee.get();
        }
        return e;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

}
