package com.kayak.myobject.controller;

import com.kayak.myobject.domain.Company;
import com.kayak.myobject.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyy
 * @version 1.0
 * @date 2021/8/5 10:53
 * @projectName:
 * @Description: 公司控制层
 */
@RestController
public class CompanyController {
    @Autowired
    CompanyRepo companyRepo;

    @GetMapping("/company/{comname}")
    public Company getCompany(@PathVariable("comname") String comname){
        Company company = (Company) companyRepo.findByNativeSql1(comname);
        return company;
    }
    @GetMapping("/company/save")
    public Company insertUser(Company company){
        return companyRepo.save(company);
    }
}
