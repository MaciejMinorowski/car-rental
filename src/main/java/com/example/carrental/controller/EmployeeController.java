package com.example.carrental.controller;

import com.example.carrental.DTO.EmployeeDTO;
import com.example.carrental.model.DepartmentModel;
import com.example.carrental.model.EmployeeModel;
import com.example.carrental.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<EmployeeModel> getEmployees(){
        // EmployeeDTO test = new EmployeeDTO("Maciej", "Minorowski", true,null);
        // employeeService.addEmployee(test);
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public void addEmployee(@RequestBody EmployeeDTO employeeDTO){
        employeeService.addEmployee(employeeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }

    @PostMapping("/edit/{id}")
    public void editEmployee(@PathVariable("id") Long id, @RequestBody EmployeeDTO employeeDTO){
        EmployeeModel employeeModel = employeeService.getEmployeeModelById(id);
        employeeService.editEmployee(employeeDTO, employeeModel);
    }



}
