package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbKeeperMapper;
import com.lzz.potato.pojo.TbKeeper;
import com.lzz.potato.pojo.TbKeeperExample;
import com.lzz.potato.pojo.TbKeeperExample.Criteria;
import com.lzz.potato.service.KeeperService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class KeeperServiceImpl implements KeeperService {

	@Autowired
	private TbKeeperMapper keeperMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbKeeper> findAll() {
		return keeperMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbKeeper> page=   (Page<TbKeeper>) keeperMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbKeeper keeper) {
		keeperMapper.insert(keeper);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbKeeper keeper){
		keeperMapper.updateByPrimaryKey(keeper);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbKeeper findOne(Integer id){
		return keeperMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			keeperMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbKeeper keeper, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbKeeperExample example=new TbKeeperExample();
		Criteria criteria = example.createCriteria();
		
		if(keeper!=null){			
						if(keeper.getkName()!=null && keeper.getkName().length()>0){
				criteria.andKNameLike("%"+keeper.getkName()+"%");
			}
			if(keeper.getkPws()!=null && keeper.getkPws().length()>0){
				criteria.andKPwsLike("%"+keeper.getkPws()+"%");
			}
	
		}
		
		Page<TbKeeper> page= (Page<TbKeeper>)keeperMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
