package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbManageMapper;
import com.lzz.potato.pojo.TbManage;
import com.lzz.potato.pojo.TbManageExample;
import com.lzz.potato.pojo.TbManageExample.Criteria;
import com.lzz.potato.service.ManageService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ManageServiceImpl implements ManageService {

	@Autowired
	private TbManageMapper manageMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbManage> findAll() {
		return manageMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbManage> page=   (Page<TbManage>) manageMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbManage manage) {
		manageMapper.insert(manage);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbManage manage){
		manageMapper.updateByPrimaryKey(manage);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbManage findOne(Integer id){
		return manageMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			manageMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbManage manage, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbManageExample example=new TbManageExample();
		Criteria criteria = example.createCriteria();
		
		if(manage!=null){			
						if(manage.getmName()!=null && manage.getmName().length()>0){
				criteria.andMNameLike("%"+manage.getmName()+"%");
			}
			if(manage.getmCompang()!=null && manage.getmCompang().length()>0){
				criteria.andMCompangLike("%"+manage.getmCompang()+"%");
			}
			if(manage.getmLeaderA()!=null && manage.getmLeaderA().length()>0){
				criteria.andMLeaderALike("%"+manage.getmLeaderA()+"%");
			}
			if(manage.getmLeaderB()!=null && manage.getmLeaderB().length()>0){
				criteria.andMLeaderBLike("%"+manage.getmLeaderB()+"%");
			}
			if(manage.getmFile()!=null && manage.getmFile().length()>0){
				criteria.andMFileLike("%"+manage.getmFile()+"%");
			}
			if(manage.getmFlag()!=null && manage.getmFlag().length()>0){
				criteria.andMFlagLike("%"+manage.getmFlag()+"%");
			}
	
		}
		
		Page<TbManage> page= (Page<TbManage>)manageMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
