package com.kayak.myobject.repository;

import com.kayak.myobject.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yangyy
 * @version 1.0
 * @date 2021/8/12 9:41
 * @projectName:
 * @Description:
 */
public interface AccountDao extends JpaRepository<Account,Integer> {
}
