package com.honsoft.springorm.service;

import java.util.List;

import com.honsoft.springorm.entity.EmployeeEntity;

public interface EmployeeManager {
    public void addEmployee(EmployeeEntity employee);
    public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
}