package com.employee.service;

import com.employee.model.EmployeeVO;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
public interface EmployeeManager
{
    public List<EmployeeVO> getAllEmployees();
}