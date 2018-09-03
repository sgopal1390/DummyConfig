/**
 * 
 */
package com.mavenapp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mavenapp.entity.TestEntity;

/**
 * @author Nextalytics-10
 *
 */
@Repository
@Transactional
public class TestDaoimpl implements TestDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void test(TestEntity entity) {

		try {
			sessionFactory.getCurrentSession().merge(entity);
		} catch (Exception exception) {
			System.out.println("Exception : " + exception.getMessage());
		}
	}

}
