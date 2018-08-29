package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbRoleMapper;
import com.lzz.potato.pojo.TbRole;
import com.lzz.potato.pojo.TbRoleExample;
import com.lzz.potato.pojo.TbRoleExample.Criteria;
import com.lzz.potato.service.RoleService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private TbRoleMapper roleMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRole> findAll() {
		return roleMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbRole> page=   (Page<TbRole>) roleMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRole role) {
		roleMapper.insert(role);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRole role){
		roleMapper.updateByPrimaryKey(role);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRole findOne(Integer id){
		return roleMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			roleMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbRole role, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRoleExample example=new TbRoleExample();
		Criteria criteria = example.createCriteria();
		
		if(role!=null){			
						if(role.getRoleName()!=null && role.getRoleName().length()>0){
				criteria.andRoleNameLike("%"+role.getRoleName()+"%");
			}
			if(role.getRoleSign()!=null && role.getRoleSign().length()>0){
				criteria.andRoleSignLike("%"+role.getRoleSign()+"%");
			}
			if(role.getRoleSalt()!=null && role.getRoleSalt().length()>0){
				criteria.andRoleSaltLike("%"+role.getRoleSalt()+"%");
			}
	
		}
		
		Page<TbRole> page= (Page<TbRole>)roleMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
