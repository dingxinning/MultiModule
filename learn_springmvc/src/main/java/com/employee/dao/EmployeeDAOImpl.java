package com.employee.dao;

import com.employee.model.EmployeeVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    public List<EmployeeVO> getAllEmployees()
    {
        List<EmployeeVO> employees = new ArrayList<EmployeeVO>();

        EmployeeVO vo1 = new EmployeeVO();
        vo1.setId(1);
        vo1.setFirstName("Lokesh");
        vo1.setLastName("Gupta");
        employees.add(vo1);

        EmployeeVO vo2 = new EmployeeVO();
        vo2.setId(2);
        vo2.setFirstName("Raj");
        vo2.setLastName("Kishore");
        employees.add(vo2);

        EmployeeVO vo3 = new EmployeeVO();
        vo3.setId(3);
        vo3.setFirstName("Nicy");
        vo3.setLastName("Terio");
        employees.add(vo3);

        return employees;
    }
}
