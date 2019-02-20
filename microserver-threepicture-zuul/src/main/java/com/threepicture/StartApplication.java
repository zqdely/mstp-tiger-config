package com.threepicture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
//Hystrix 仪表盘  与ribbon有区别 EnableCircuitBreaker此注解必须得加； @EnableHystrixDashboard-对微服务监控的可视化界面的展示 
@EnableHystrix
//@EnableHystrix封装了@EnableCircuitBreaker
public class StartApplication {
	
	 private static Logger logger = LoggerFactory.getLogger(StartApplication.class);

	public static void main(String[] args) {
		
		logger.info("进入zuul网关。。。");
		
		SpringApplication.run(StartApplication.class, args);
	}
	
}

