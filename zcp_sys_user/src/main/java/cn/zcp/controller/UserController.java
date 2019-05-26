package cn.zcp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-26 19:58
 * @describe spring-cloud2 <描述>
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public Object getUser(){
        Map<String,String> map = new HashMap<>();
        map.put("code","10000");
        return map;
    }
}
