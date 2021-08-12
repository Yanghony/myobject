package com.kayak.myobject.repository;

import com.kayak.myobject.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yangyy
 * @version 1.0
 * @date 2021/8/5 9:04
 * @projectName:
 * @Description: 公司数据仓库接口
 */
@Repository
public interface CompanyRepo extends JpaRepository<Company,Integer> {
    //原生sql查询
    @Query(value = "select * from company where comname = ?1",nativeQuery = true)
    List<Company> findByNativeSql(String comname);

    @Query(value = "select * from company where comname like '%?1%'",nativeQuery = true)
    List<Company> findByNativeSql1(String comname);

    @Modifying
    @Query(value = "update company set comadress = ?1 where comname = ?2",nativeQuery = true)
    void updateByName(String comaddress,String comname);
}