package com.tedu.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.tedu.bean.EmpBean;
import com.tedu.mapper.EmpMapper;

public class TestMapper extends SuperTestMapper{
	@Test
	public void TestA() {
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.selectOrderByName("name");
		for(EmpBean bean:list) {
			System.out.println(bean);
		}
	}
	
	@Test //ģ����ѯ name
	public void TestB() {
		String name = "��";
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.selectEmpByName(name);
		for(EmpBean bean:list) {
			System.out.println(bean);
		}
	}
	
	@Test //ģ����ѯ name
	public void TestC() {
		EmpBean bean = new EmpBean();
		bean.setName("��");
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.selectLike(bean);
		for(EmpBean beans:list) {
			System.out.println(bean);
		}
	}
	
	@Test
	public void TestD() {
		Map<String, Object> map = new HashMap<>();
		map.put("sex", 2);
		map.put("name", "��");
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.selectMapLike(map);
		for(EmpBean bean:list) {
			System.out.println(bean);
		}
	}
	
	@Test
	public void TestE() {
		List<Object> list=new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list2 = mapper.selectIn(list);
		for(EmpBean beans:list2) {
			System.out.println(beans);
		}
	}
	
	@Test
	public void TestF() { //ʹ������
		int [] arr = {1,3,5};
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.setcetInarr(arr);
		for(EmpBean beans:list) {
			System.out.println(beans);
		}
	}
	
	@Test
	public void TestG() {
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		List<EmpBean> list = mapper.selectEmpByName("��");
		EmpBean bean = list.get(0);
		System.out.println(bean);
		bean.setName("abcd");
		bean.setSex(3);
		mapper.updateEmp(bean);
		session.commit();
		System.out.println("11111");
	}
	
	@Test
	public void TestH() {
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		EmpBean bean = new EmpBean();
		bean.setName("qwer11");
		bean.setSalary(0);
		bean.setSex(0);
		mapper.insertEmp(bean);
		session.commit();
		System.out.println(bean);
	}
}

