package com.kodilla.patterns2.adapter.company.newhrystem;

import com.kodilla.patterns2.adapter.company.newhrystem.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface SalaryProcessor {
    BigDecimal calculateSalaries(List<Employee> employees);
}
