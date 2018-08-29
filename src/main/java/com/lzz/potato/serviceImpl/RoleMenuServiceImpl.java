package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbRoleMenuMapper;
import com.lzz.potato.pojo.TbRoleMenu;
import com.lzz.potato.pojo.TbRoleMenuExample;
import com.lzz.potato.pojo.TbRoleMenuExample.Criteria;
import com.lzz.potato.service.RoleMenuService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {

	@Autowired
	private TbRoleMenuMapper roleMenuMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRoleMenu> findAll() {
		return roleMenuMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbRoleMenu> page=   (Page<TbRoleMenu>) roleMenuMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRoleMenu roleMenu) {
		roleMenuMapper.insert(roleMenu);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRoleMenu roleMenu){
		roleMenuMapper.updateByPrimaryKey(roleMenu);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRoleMenu findOne(Integer id){
		return roleMenuMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			roleMenuMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbRoleMenu roleMenu, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRoleMenuExample example=new TbRoleMenuExample();
		Criteria criteria = example.createCriteria();
		
		if(roleMenu!=null){			
				
		}
		
		Page<TbRoleMenu> page= (Page<TbRoleMenu>)roleMenuMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
