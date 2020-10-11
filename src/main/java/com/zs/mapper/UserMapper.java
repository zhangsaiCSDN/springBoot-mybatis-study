package com.zs.mapper;

import com.zs.modle.User;

import java.util.List;
import java.util.Map;

/**
 * @author zs
 * @create 2020-09-24 9:58
 */
public interface UserMapper {
    public List<Map<String,Object>> findAll();
    public void  add(Map<String,List<User>> map);
}
