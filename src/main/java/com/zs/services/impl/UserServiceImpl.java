package com.zs.services.impl;

import com.zs.mapper.UserMapper;
import com.zs.modle.User;
import com.zs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author zs
 * @create 2020-09-24 10:00
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Map<String,Object>> findAll() {
        System.out.println(userMapper.findAll());
        return userMapper.findAll();
    }

    @Override
    public void add(Map<String,List<User>> map) {
        userMapper.add(map);
    }
}
