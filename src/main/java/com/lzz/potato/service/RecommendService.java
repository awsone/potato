package com.lzz.potato.service;
import java.util.List;

import com.lzz.potato.pojo.TbRecommend;
import com.lzz.potato.util.PageResult;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface RecommendService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbRecommend> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbRecommend recommend);
	
	
	/**
	 * 修改
	 */
	public void update(TbRecommend recommend);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbRecommend findOne(Integer id);
	
	
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
	public PageResult findPage(TbRecommend recommend, int pageNum,int pageSize);
	
}
