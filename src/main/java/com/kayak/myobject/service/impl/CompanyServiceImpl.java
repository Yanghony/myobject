package com.kayak.myobject.service.impl;

import com.kayak.myobject.domain.Company;
import com.kayak.myobject.repository.CompanyRepo;
import com.kayak.myobject.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author yangyy
 * @version 1.0
 * @date 2021/8/5 10:22
 * @projectName:
 * @Description: 公司业务实现类
 */
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepo companyRepo;

    @Override
    public void save(Company company) {
        companyRepo.save(company);
    }

    @Override
    public void delete(String uuid) {
        companyRepo.deleteById(uuid);
    }

    @Transactional
    @Override
    public void update(Company company) {
        companyRepo.save(company);
    }

    @Override
    public List<Company> findAll() {
        return companyRepo.findAll();
    }

    @Override
    public List<Company> findByNativeSql(String companyname) {
        /**
         * 根据原生sql语句查询
         */
        return companyRepo.findByNativeSql1(companyname);
    }
}
