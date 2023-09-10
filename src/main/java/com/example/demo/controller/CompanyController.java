package com.example.demo.controller;

import com.example.demo.pojo.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> getCompanies() {
        return companyService.getCompanies();
    }

    @PostMapping
    public String addCompany(Company company) {
        if (companyService.addCompany(company)) {
            return "OK";
        } else {
            return "Fail";
        }
    }

    @GetMapping("/{comId}")
    public Company getCompany(@PathVariable("comId") int comId) {

        return companyService.getById(comId);
    }

    @PutMapping("/{comId}")
    public String updateCompany(@PathVariable("comId") int comId, @RequestBody Company company) {

        company.setOrgUniCode(String.valueOf(comId));
        companyService.updateCompany(company);
        return "OK";
    }

    @DeleteMapping("/{comId}")
    public String deleteCompany(@PathVariable("comId") int comId) {
        if (companyService.deleteCompany(comId)) {
            return "OK";
        } else {
            return "Fail";
        }
    }
}
