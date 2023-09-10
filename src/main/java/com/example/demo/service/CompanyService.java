package com.example.demo.service;

import com.example.demo.pojo.Company;
import com.example.demo.pojo.query.CompanyQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CompanyService {

    List<Company> getCompanies();

    PageInfo<Company> byPage(CompanyQuery query);

    Boolean addCompany(Company company);

    Company getById(int id);

    Boolean updateCompany(Company company);

    Boolean deleteCompany(int id);
}
