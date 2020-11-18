package com.ssmTest.dao;

import com.ssmTest.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Yinjie on 2020/11/18
 */
@Repository
public interface UserDao {
    /**
     * 查询所有的用户信息
     */
    public List<User> findAll();
}
