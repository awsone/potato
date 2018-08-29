package com.lzz.potato.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzz.potato.pojo.TbRecommend;
import com.lzz.potato.service.RecommendService;
import com.lzz.potato.util.PageResult;
import com.lzz.potato.util.Result;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/recommend")
public class RecommendController {

	@Autowired
	private RecommendService recommendService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbRecommend> findAll(){			
		return recommendService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return recommendService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param recommend
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbRecommend recommend){
		try {
			recommendService.add(recommend);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param recommend
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbRecommend recommend){
		try {
			recommendService.update(recommend);
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
	public TbRecommend findOne(Integer id){
		return recommendService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			recommendService.delete(ids);
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
	public PageResult search(@RequestBody TbRecommend recommend, int page, int rows  ){
		return recommendService.findPage(recommend, page, rows);		
	}
	
}
