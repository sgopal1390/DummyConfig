/**
 * 
 */
package com.mavenapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mavenapp.dao.TestDao;
import com.mavenapp.entity.TestEntity;

/**
 * @author Nextalytics-10
 *
 */
@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestDao  testDao;

	
	@Override
	public void test(TestEntity entity) {
		
		testDao.test(entity);
		
	}
	
}
