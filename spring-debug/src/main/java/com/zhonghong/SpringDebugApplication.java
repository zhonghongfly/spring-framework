package com.zhonghong;

import com.zhonghong.service.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动测试类
 * @author zhonghong
 */
@ComponentScan("com.zhonghong.*")
public class SpringDebugApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SpringDebugApplication.class);

		CarService carService = context.getBean(CarService.class);
		System.out.println(carService.getBrand());
		System.out.println(carService.getColor());
	}
}
