package com.honsoft.springorm.dao;

import java.util.List;

import com.honsoft.springorm.entity.EmployeeEntity;

public interface EmployeeDao
{
    public void addEmployee(EmployeeEntity employee);

	public List<EmployeeEntity> getAllEmployees();
    public void deleteEmployee(Integer employeeId);
}