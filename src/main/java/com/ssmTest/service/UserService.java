package com.ssmTest.service;

import com.ssmTest.dao.UserDao;
import com.ssmTest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yinjie on 2020/11/18
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public List<User> selectAll(){
        return userDao.findAll();
    }
}
