package com.suxiaowei.mysqlclient;

import com.suxiaowei.mysqlclient.util.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MysqlclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlclientApplication.class, args);
	}


	/**
	 * 创建Id生成器
	 * @return
	 */
	@Bean
	public IdWorker idWorker(){
		return new IdWorker(1,1);
	}
}
