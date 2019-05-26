package cn.zcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-26 19:51
 * @describe spring-cloud2
 *
 * 用户系统启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class UserSysApp {

    public static void main(String[] args) {

        SpringApplication.run(UserSysApp.class,args);
    }
}
