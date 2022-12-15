package com.kodilla.hibernate.manytomany.facade;

public class NoDataException extends Exception {

    public static String ERROR_COMPANY_NOT_FOUND = "Company not found";
    public static String ERROR_EMPLOYEE_NOT_FOUND = "Employee not found";

    public NoDataException(String message){
        super(message);
    }
}
