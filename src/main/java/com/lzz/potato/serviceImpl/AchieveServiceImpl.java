package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbAchieveMapper;
import com.lzz.potato.pojo.TbAchieve;
import com.lzz.potato.pojo.TbAchieveExample;
import com.lzz.potato.pojo.TbAchieveExample.Criteria;
import com.lzz.potato.service.AchieveService;
import com.lzz.potato.util.PageResult;



/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class AchieveServiceImpl implements AchieveService {

	@Autowired
	private TbAchieveMapper achieveMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbAchieve> findAll() {
		return achieveMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbAchieve> page=   (Page<TbAchieve>) achieveMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbAchieve achieve) {
		achieveMapper.insert(achieve);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbAchieve achieve){
		achieveMapper.updateByPrimaryKey(achieve);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbAchieve findOne(Integer id){
		return achieveMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			achieveMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbAchieve achieve, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbAchieveExample example=new TbAchieveExample();
		Criteria criteria = example.createCriteria();
		
		if(achieve!=null){			
						if(achieve.getAcContent()!=null && achieve.getAcContent().length()>0){
				criteria.andAcContentLike("%"+achieve.getAcContent()+"%");
			}
			if(achieve.getAcSale()!=null && achieve.getAcSale().length()>0){
				criteria.andAcSaleLike("%"+achieve.getAcSale()+"%");
			}
			if(achieve.getAcLevel()!=null && achieve.getAcLevel().length()>0){
				criteria.andAcLevelLike("%"+achieve.getAcLevel()+"%");
			}
			if(achieve.getAcFile()!=null && achieve.getAcFile().length()>0){
				criteria.andAcFileLike("%"+achieve.getAcFile()+"%");
			}
	
		}
		
		Page<TbAchieve> page= (Page<TbAchieve>)achieveMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
