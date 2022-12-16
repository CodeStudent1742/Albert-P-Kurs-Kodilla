package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompanyEmployeeFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyEmployeeFacade.class);
    @Autowired
    private final CompanyDao companyDao;
    @Autowired
    private final EmployeeDao employeeDao;


    @Autowired
    public CompanyEmployeeFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompanyByFragment(String fragment) throws NoDataException{

        List<Company> companies = companyDao.findCompanyByFragment(fragment);
        if( companies.size()==0){
            LOGGER.error(NoDataException.ERROR_COMPANY_NOT_FOUND);
            throw new NoDataException(NoDataException.ERROR_COMPANY_NOT_FOUND);
        }else{
            LOGGER.info("Found company/companies: ");
        }
        return companies;
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

