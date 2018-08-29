package com.lzz.potato.service;
import java.util.List;

import com.lzz.potato.pojo.TbReward;
import com.lzz.potato.util.PageResult;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface RewardService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbReward> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbReward reward);
	
	
	/**
	 * 修改
	 */
	public void update(TbReward reward);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbReward findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbReward reward, int pageNum,int pageSize);
	
}
