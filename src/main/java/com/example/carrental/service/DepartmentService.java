package com.example.carrental.service;

import com.example.carrental.DTO.DepartmentDTO;
import com.example.carrental.mapper.DepartmentMapper;
import com.example.carrental.model.DepartmentModel;
import com.example.carrental.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentMapper departmentMapper;


    public List<DepartmentModel> getAllDepartments(){
        return departmentRepository.findAll();
    }

    public void addDepartment(DepartmentDTO departmentDTO) {
        DepartmentModel newDepartment = new DepartmentModel();
        departmentMapper.departmentDTOToDepartmentModel(departmentDTO, newDepartment);
        departmentRepository.save(newDepartment);
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }


    public DepartmentModel getDepartmentModelById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public void editDepartment(DepartmentDTO departmentDTO, DepartmentModel editedDepartmentModel) {
        departmentMapper.departmentDTOToDepartmentModel(departmentDTO, editedDepartmentModel);
        departmentRepository.save(editedDepartmentModel);

    }
}
