package com.lzz.potato.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzz.potato.pojo.TbMenu;
import com.lzz.potato.service.MenuService;
import com.lzz.potato.util.PageResult;
import com.lzz.potato.util.Result;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbMenu> findAll(){			
		return menuService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return menuService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param menu
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbMenu menu){
		try {
			menuService.add(menu);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param menu
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbMenu menu){
		try {
			menuService.update(menu);
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
	public TbMenu findOne(Integer id){
		return menuService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			menuService.delete(ids);
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
	public PageResult search(@RequestBody TbMenu menu, int page, int rows  ){
		return menuService.findPage(menu, page, rows);		
	}
	
}
