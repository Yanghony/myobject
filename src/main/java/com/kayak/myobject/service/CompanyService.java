package com.kayak.myobject.service;

import com.kayak.myobject.domain.Company;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author yangyy
 * @version 1.0
 * @date 2021/8/5 10:13
 * @projectName:
 * @Description: 公司业务层
 */
public interface CompanyService {
    //保存
    void save(Company company);

    //删除
    @Transactional
    void delete(String uuid);

    //修改
    @Transactional
    void update(Company company);

    //查询全部数据
    List<Company> findAll();

    //执行原生sql语句
    List<Company> findByNativeSql(String companyname);
}
