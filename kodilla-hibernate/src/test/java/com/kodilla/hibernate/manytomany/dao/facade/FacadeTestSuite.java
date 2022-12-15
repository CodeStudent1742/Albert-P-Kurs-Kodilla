package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.CompanyFacade;
import com.kodilla.hibernate.manytomany.facade.EmployeeFacade;
import com.kodilla.hibernate.manytomany.facade.NoDataException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyFacade companyFacade;

    @Autowired
    private EmployeeFacade employeeFacade;

    @Test
    public void testCompanyFacadeSearchByFragment() throws NoDataException {
        // GIVEN
        Company company = new Company("SuperFirma");
        companyDao.save(company);
        Company company2 = new Company("SuperFirma2");
        companyDao.save(company2);
        // WHEN
        List <Company> companies = companyFacade.findCompanyByFragment("irm");
        // THEN
        Assertions.assertEquals(2, companies.size());
        //CLEAN UP
        companyDao.delete(company);
        companyDao.delete(company2);
    }
    @Test
    public void testEmployeeFacadeSearchByFragment() throws NoDataException {
        // GIVEN
        Employee employee = new Employee("Jan", "Kowalski");
        employeeDao.save(employee);
        Employee employee2 = new Employee("Jan", "Nowak");
        employeeDao.save(employee2);
        // WHEN
        List <Employee> employees = employeeFacade.findEmployeeByFragment("wak");
        String expectedName = employees.get(0).getLastname();
        // THEN
        Assertions.assertEquals(1, employees.size());
        Assertions.assertEquals("Nowak", expectedName);
        //CLEAN UP
        employeeDao.delete(employee);
        employeeDao.delete(employee2);
    }

}
