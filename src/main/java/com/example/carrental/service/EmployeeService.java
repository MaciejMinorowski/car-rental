package com.example.carrental.service;

import com.example.carrental.DTO.EmployeeDTO;
import com.example.carrental.mapper.EmployeeMapper;
import com.example.carrental.model.EmployeeModel;
import com.example.carrental.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public List<EmployeeModel> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void addEmployee(EmployeeDTO employeeDTO) {
        EmployeeModel newEmployee = new EmployeeModel();
        employeeMapper.employeeDTOTOEmployeeModel(employeeDTO, newEmployee);
        employeeRepository.save(newEmployee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    public EmployeeModel getEmployeeModelById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }


    public void editEmployee(EmployeeDTO employeeDTO, EmployeeModel editedEmployeeModel) {
        employeeMapper.employeeDTOTOEmployeeModel(employeeDTO,editedEmployeeModel);
        employeeRepository.save(editedEmployeeModel);
    }
}
