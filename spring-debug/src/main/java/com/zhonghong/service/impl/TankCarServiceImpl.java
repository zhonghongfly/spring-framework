package com.zhonghong.service.impl;

import com.zhonghong.service.CarService;
import org.springframework.stereotype.Service;

/**
 * Tank car
 * @author zhonghong
 */
@Service
public class TankCarServiceImpl implements CarService {

	@Override
	public String getColor() {
		return "Color:Red";
	}

	@Override
	public String getBrand() {
		return "Brand:Tank";
	}
}
