package com.employee.dao;

import com.employee.model.EmployeeVO;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
public interface EmployeeDAO
{
    public List<EmployeeVO> getAllEmployees();
}