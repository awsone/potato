package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbRecommendMapper;
import com.lzz.potato.pojo.TbRecommend;
import com.lzz.potato.pojo.TbRecommendExample;
import com.lzz.potato.pojo.TbRecommendExample.Criteria;
import com.lzz.potato.service.RecommendService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RecommendServiceImpl implements RecommendService {

	@Autowired
	private TbRecommendMapper recommendMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRecommend> findAll() {
		return recommendMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbRecommend> page=   (Page<TbRecommend>) recommendMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRecommend recommend) {
		recommendMapper.insert(recommend);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRecommend recommend){
		recommendMapper.updateByPrimaryKey(recommend);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRecommend findOne(Integer id){
		return recommendMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			recommendMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbRecommend recommend, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRecommendExample example=new TbRecommendExample();
		Criteria criteria = example.createCriteria();
		
		if(recommend!=null){			
						if(recommend.getrLevel()!=null && recommend.getrLevel().length()>0){
				criteria.andRLevelLike("%"+recommend.getrLevel()+"%");
			}
			if(recommend.getrName()!=null && recommend.getrName().length()>0){
				criteria.andRNameLike("%"+recommend.getrName()+"%");
			}
	
		}
		
		Page<TbRecommend> page= (Page<TbRecommend>)recommendMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
