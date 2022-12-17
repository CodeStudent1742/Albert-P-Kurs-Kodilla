package com.kodilla.patterns2.adapter.company.newhrystem;

import com.kodilla.patterns2.adapter.company.newhrystem.Employee;
import com.kodilla.patterns2.adapter.company.newhrystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class CompanySalaryProcessor implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Employee employee : employees) {
            System.out.println(employee);
            sum = sum.add(employee.getBaseSalary());
        }
        return sum;
    }

}
