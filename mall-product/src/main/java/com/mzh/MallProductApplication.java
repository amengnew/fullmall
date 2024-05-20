package com.mzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. mybatis-plus
 * 	1) 导入依赖
 * 	2) 配置
 * 		1.配置数据源
 * 			1）导入数据源驱动
 * 			2）application-yml配置数据源相关信息
 * 		2.配置mybatis-plus
 * 			1）使用mapper-scan
 * 			2) 告诉	mybatis-plus sql映射文件位置
 */

@MapperScan("com.mzh.product.dao")
@SpringBootApplication
public class MallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallProductApplication.class, args);
	}

}
