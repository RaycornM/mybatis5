package com.tedu.mapper;

import java.util.List;
import java.util.Map;

import com.tedu.bean.EmpBean;

/**
 * 排序 和 组函数处理
 * @author Teacher
 */
public interface EmpMapper {
//	按名字进行排序查询
	public List<EmpBean> selectOrderByName(String name);
	
	//模糊查询 使用name来查询出list列表
	public List<EmpBean> selectEmpByName(String name);
	
	//再模糊查询
	public List<EmpBean> selectLike(EmpBean bean);
	
	//传入对象类型
	public List<EmpBean> selectMapLike(Map<String,Object> map);
	
	//in查询 select * from emp where id in (1,3,5);
	public List<EmpBean> selectIn(List<Object> list);
	
	//in查询 传入对象是数组
	public List<EmpBean> setcetInarr(int [] arr);
	
	//修改 update emp set name=?,sex=?,salary=? where id = ?
	public int updateEmp(EmpBean bean); //Map  看上层代码怎么编写
	
}
