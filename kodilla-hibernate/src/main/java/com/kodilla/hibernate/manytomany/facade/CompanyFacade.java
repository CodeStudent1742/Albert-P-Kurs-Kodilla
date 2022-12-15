package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);
    @Autowired
    private final CompanyDao companyDao;

    @Autowired
    public CompanyFacade(CompanyDao companyDao) {
        this.companyDao = companyDao;
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
}

