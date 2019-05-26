package cn.zcp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-26 22:15
 * @describe spring-cloud2 <描述>
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 远程调用用户系统,Ribbon
     * @return
     */
    @RequestMapping("/getOrder")
    public String getOrder(){

        String url = "http://sys-user/user/getUser";
        Object resultObj = restTemplate.getForObject(url, Object.class);
        System.out.println("通过调用sys_user系统获取数据;"+resultObj);

        return "get user order";
    }
}
