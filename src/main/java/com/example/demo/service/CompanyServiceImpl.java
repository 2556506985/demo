package com.example.demo.service;

import com.example.demo.dao.CompanyDao;
import com.example.demo.pojo.Company;
import com.example.demo.pojo.query.CompanyQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> getCompanies() {
        return companyDao.getAllCompanies();
    }

    @Override
    public PageInfo<Company> byPage(CompanyQuery query) {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        return new  PageInfo<Company>(companyDao.byPage(query));
    }

    @Override
    public Boolean addCompany(Company company) {
        return companyDao.addCompany(company) > 0;
    }

    @Override
    public Company getById(int id) {
        return companyDao.getById(id);
    }

    @Override
    public Boolean updateCompany(Company company) {
        return companyDao.updateCompany(company) > 0;
    }

    @Override
    public Boolean deleteCompany(int id) {
        return companyDao.deleteCompany(id)>0;
    }
}
