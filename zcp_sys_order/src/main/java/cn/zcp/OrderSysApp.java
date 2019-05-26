package cn.zcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-05-26 22:11
 * @describe spring-cloud2
 *
 * 订单系统服务入口
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderSysApp {

    public static void main(String[] args) {
        SpringApplication.run(OrderSysApp.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
