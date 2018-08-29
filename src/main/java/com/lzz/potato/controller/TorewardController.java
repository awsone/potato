package com.lzz.potato.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzz.potato.pojo.TbToreward;
import com.lzz.potato.service.TorewardService;
import com.lzz.potato.util.PageResult;
import com.lzz.potato.util.Result;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/toreward")
public class TorewardController {

	@Autowired
	private TorewardService torewardService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbToreward> findAll(){			
		return torewardService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return torewardService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param toreward
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbToreward toreward){
		try {
			torewardService.add(toreward);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param toreward
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbToreward toreward){
		try {
			torewardService.update(toreward);
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
	public TbToreward findOne(Integer id){
		return torewardService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			torewardService.delete(ids);
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
	public PageResult search(@RequestBody TbToreward toreward, int page, int rows  ){
		return torewardService.findPage(toreward, page, rows);		
	}
	
}
