package com.zs.services;

import com.zs.modle.User;

import java.util.List;
import java.util.Map;

/**
 * @author zs
 * @create 2020-09-24 9:59
 */
public interface UserService {
    public List<Map<String,Object>> findAll();
    public void  add(Map<String,List<User>> map);
}
