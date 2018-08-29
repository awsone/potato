package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbUserRoleMapper;
import com.lzz.potato.pojo.TbUserRole;
import com.lzz.potato.pojo.TbUserRoleExample;
import com.lzz.potato.pojo.TbUserRoleExample.Criteria;
import com.lzz.potato.service.UserRoleService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private TbUserRoleMapper userRoleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbUserRole> findAll() {
		return userRoleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbUserRole> page=   (Page<TbUserRole>) userRoleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbUserRole userRole) {
		userRoleMapper.insert(userRole);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbUserRole userRole){
		userRoleMapper.updateByPrimaryKey(userRole);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbUserRole findOne(Integer id){
		return userRoleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			userRoleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbUserRole userRole, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbUserRoleExample example=new TbUserRoleExample();
		Criteria criteria = example.createCriteria();
		
		if(userRole!=null){			
				
		}
		
		Page<TbUserRole> page= (Page<TbUserRole>)userRoleMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
