package com.gudlike.fishing.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gudlike.fishing.BaseTest;
import com.gudlike.fishing.service.PointService;

public class TestPointService extends BaseTest {

	@Autowired
	private PointService pointService;

	@Test
	public void testGetListInRange() {
		System.out.println(pointService.getListInRange());
	}
}
