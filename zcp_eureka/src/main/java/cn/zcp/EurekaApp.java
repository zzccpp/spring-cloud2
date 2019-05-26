package cn.zcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-26 18:36
 * @describe spring-cloud2
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {

    public static void main(String[] args) {

        SpringApplication.run(EurekaApp.class,args);

    }
}
