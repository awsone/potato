package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbTorewardMapper;
import com.lzz.potato.pojo.TbToreward;
import com.lzz.potato.pojo.TbTorewardExample;
import com.lzz.potato.pojo.TbTorewardExample.Criteria;
import com.lzz.potato.service.TorewardService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class TorewardServiceImpl implements TorewardService {

	@Autowired
	private TbTorewardMapper torewardMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbToreward> findAll() {
		return torewardMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbToreward> page=   (Page<TbToreward>) torewardMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbToreward toreward) {
		torewardMapper.insert(toreward);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbToreward toreward){
		torewardMapper.updateByPrimaryKey(toreward);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbToreward findOne(Integer id){
		return torewardMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			torewardMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbToreward toreward, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbTorewardExample example=new TbTorewardExample();
		Criteria criteria = example.createCriteria();
		
		if(toreward!=null){			
						if(toreward.gettLevel()!=null && toreward.gettLevel().length()>0){
				criteria.andTLevelLike("%"+toreward.gettLevel()+"%");
			}
			if(toreward.gettRegister()!=null && toreward.gettRegister().length()>0){
				criteria.andTRegisterLike("%"+toreward.gettRegister()+"%");
			}
			if(toreward.gettFile()!=null && toreward.gettFile().length()>0){
				criteria.andTFileLike("%"+toreward.gettFile()+"%");
			}
	
		}
		
		Page<TbToreward> page= (Page<TbToreward>)torewardMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
