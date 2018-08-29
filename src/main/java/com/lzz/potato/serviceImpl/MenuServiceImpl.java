package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbMenuMapper;
import com.lzz.potato.pojo.TbMenu;
import com.lzz.potato.pojo.TbMenuExample;
import com.lzz.potato.pojo.TbMenuExample.Criteria;
import com.lzz.potato.service.MenuService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private TbMenuMapper menuMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbMenu> findAll() {
		return menuMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbMenu> page=   (Page<TbMenu>) menuMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbMenu menu) {
		menuMapper.insert(menu);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbMenu menu){
		menuMapper.updateByPrimaryKey(menu);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbMenu findOne(Integer id){
		return menuMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			menuMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbMenu menu, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbMenuExample example=new TbMenuExample();
		Criteria criteria = example.createCriteria();
		
		if(menu!=null){			
						if(menu.getMenuName()!=null && menu.getMenuName().length()>0){
				criteria.andMenuNameLike("%"+menu.getMenuName()+"%");
			}
			if(menu.getUrl()!=null && menu.getUrl().length()>0){
				criteria.andUrlLike("%"+menu.getUrl()+"%");
			}
			if(menu.getResourcetype()!=null && menu.getResourcetype().length()>0){
				criteria.andResourcetypeLike("%"+menu.getResourcetype()+"%");
			}
			if(menu.getParentids()!=null && menu.getParentids().length()>0){
				criteria.andParentidsLike("%"+menu.getParentids()+"%");
			}
			if(menu.getPermission()!=null && menu.getPermission().length()>0){
				criteria.andPermissionLike("%"+menu.getPermission()+"%");
			}
	
		}
		
		Page<TbMenu> page= (Page<TbMenu>)menuMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
