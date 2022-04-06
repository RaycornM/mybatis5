package com.tedu.mapper;

import java.util.List;
import java.util.Map;

import com.tedu.bean.EmpBean;

/**
 * ���� �� �麯������
 * @author Teacher
 */
public interface EmpMapper {
//	�����ֽ��������ѯ
	public List<EmpBean> selectOrderByName(String name);
	
	//ģ����ѯ ʹ��name����ѯ��list�б�
	public List<EmpBean> selectEmpByName(String name);
	
	//��ģ����ѯ
	public List<EmpBean> selectLike(EmpBean bean);
	
	//�����������
	public List<EmpBean> selectMapLike(Map<String,Object> map);
	
	//in��ѯ select * from emp where id in (1,3,5);
	public List<EmpBean> selectIn(List<Object> list);
	
	//in��ѯ �������������
	public List<EmpBean> setcetInarr(int [] arr);
	
	//�޸� update emp set name=?,sex=?,salary=? where id = ?
	public int updateEmp(EmpBean bean); //Map  ���ϲ������ô��д
	
}
