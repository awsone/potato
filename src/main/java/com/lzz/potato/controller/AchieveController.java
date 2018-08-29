package com.lzz.potato.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzz.potato.pojo.TbAchieve;
import com.lzz.potato.service.AchieveService;
import com.lzz.potato.util.PageResult;
import com.lzz.potato.util.Result;

/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/achieve")
public class AchieveController {

	@Autowired
	private AchieveService achieveService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbAchieve> findAll(){			
		return achieveService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return achieveService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param achieve
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbAchieve achieve){
		try {
			achieveService.add(achieve);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param achieve
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbAchieve achieve){
		try {
			achieveService.update(achieve);
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
	public TbAchieve findOne(Integer id){
		return achieveService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			achieveService.delete(ids);
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
	public PageResult search(@RequestBody TbAchieve achieve, int page, int rows  ){
		return achieveService.findPage(achieve, page, rows);		
	}
	
}
