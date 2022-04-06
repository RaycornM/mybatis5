package com.tedu.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

public class SuperTestMapper {
	public SqlSession session;
	
	//前置：需要实例化对象
	@Before
	public void beforeMethod() {
		InputStream in = SuperTestMapper.class.getClassLoader().getResourceAsStream("mybatis-configs.xml");
		
		SqlSessionFactory factory =  new SqlSessionFactoryBuilder().build(in);
		session = factory.openSession();
		
	}
	//后置任务
	@After
	public void afterMethod() {
		session.close();
	}
}
