package com.example.demo.dao;


import com.example.demo.pojo.Company;
import com.example.demo.pojo.query.CompanyQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompanyDao {
    List<Company> getAllCompanies();


    List<Company> byPage(CompanyQuery query);

    int addCompany(Company company);

    Company getById(@Param("id") int id);

    int updateCompany(Company company);

    int deleteCompany(@Param("id") int id);
}
