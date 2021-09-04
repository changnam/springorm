package com.honsoft.springorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.honsoft.springorm.dao.EmployeeDao;
import com.honsoft.springorm.entity.EmployeeEntity;

@Service
public class EmployeeManagerImpl implements EmployeeManager 
{
    @Autowired
    private EmployeeDao employeeDao;
    
    @Transactional
    public void addEmployee(EmployeeEntity employee) {
        employeeDao.addEmployee(employee);
    }
    @Transactional
    public List<EmployeeEntity> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
    
    @Transactional
    public void deleteEmployee(Integer employeeId) {
        employeeDao.deleteEmployee(employeeId);
    }
    public void setemployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
