package com.zs.controller;

import com.zs.modle.User;
import com.zs.services.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Retention;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zs
 * @create 2020-09-23 17:30
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "hello word";
    }

    @GetMapping("getUsers")
    @ApiOperation(value = "获取所有用户")
    public List<Map<String,Object>> getUsers(User user){
        return userService.findAll();
    }

    @PostMapping("/add")
    public Map<String,String> add(@RequestBody @ApiParam(value = "user实体集合") List<User> list){
        Map map = new HashMap();
        try {
            map.put("list",list);
            userService.add(map);
        }catch (Exception e){
            e.printStackTrace();
            map.put("msg","添加失败");
            return map;
        }
        map.put("msg","添加成功");
        return map;
    }
}
