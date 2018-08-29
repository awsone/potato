package com.lzz.potato.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzz.potato.pojo.TbReward;
import com.lzz.potato.service.RewardService;
import com.lzz.potato.util.PageResult;
import com.lzz.potato.util.Result;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/reward")
public class RewardController {

	@Autowired
	private RewardService rewardService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbReward> findAll(){			
		return rewardService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return rewardService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param reward
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbReward reward){
		try {
			rewardService.add(reward);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param reward
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbReward reward){
		try {
			rewardService.update(reward);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbReward findOne(Integer id){
		return rewardService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			rewardService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbReward reward, int page, int rows  ){
		return rewardService.findPage(reward, page, rows);		
	}
	
}
