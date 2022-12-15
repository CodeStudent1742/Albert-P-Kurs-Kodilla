package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);
    @Autowired
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeFacade(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> findEmployeeByFragment(String fragment) throws NoDataException{

        List<Employee> employees = employeeDao.findEmployeeByFragment(fragment);
        if( employees.size()==0){
            LOGGER.error(NoDataException.ERROR_EMPLOYEE_NOT_FOUND);
            throw new NoDataException(NoDataException.ERROR_EMPLOYEE_NOT_FOUND);
        }else{
            LOGGER.info("Found employee/employees: ");
        }
        return employees;
    }

}





