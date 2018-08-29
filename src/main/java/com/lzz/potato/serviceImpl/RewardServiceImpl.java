package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbRewardMapper;
import com.lzz.potato.pojo.TbReward;
import com.lzz.potato.pojo.TbRewardExample;
import com.lzz.potato.pojo.TbRewardExample.Criteria;
import com.lzz.potato.service.RewardService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RewardServiceImpl implements RewardService {

	@Autowired
	private TbRewardMapper rewardMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbReward> findAll() {
		return rewardMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbReward> page=   (Page<TbReward>) rewardMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbReward reward) {
		rewardMapper.insert(reward);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbReward reward){
		rewardMapper.updateByPrimaryKey(reward);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbReward findOne(Integer id){
		return rewardMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			rewardMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbReward reward, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRewardExample example=new TbRewardExample();
		Criteria criteria = example.createCriteria();
		
		if(reward!=null){			
						if(reward.getReLevel()!=null && reward.getReLevel().length()>0){
				criteria.andReLevelLike("%"+reward.getReLevel()+"%");
			}
			if(reward.getReName()!=null && reward.getReName().length()>0){
				criteria.andReNameLike("%"+reward.getReName()+"%");
			}
	
		}
		
		Page<TbReward> page= (Page<TbReward>)rewardMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}

	
}
