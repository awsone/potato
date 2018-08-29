package com.lzz.potato.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzz.potato.pojo.TbRoleMenu;
import com.lzz.potato.service.RoleMenuService;
import com.lzz.potato.util.PageResult;
import com.lzz.potato.util.Result;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/roleMenu")
public class RoleMenuController {

	@Autowired
	private RoleMenuService roleMenuService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbRoleMenu> findAll(){			
		return roleMenuService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return roleMenuService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param roleMenu
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbRoleMenu roleMenu){
		try {
			roleMenuService.add(roleMenu);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param roleMenu
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbRoleMenu roleMenu){
		try {
			roleMenuService.update(roleMenu);
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
	public TbRoleMenu findOne(Integer id){
		return roleMenuService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			roleMenuService.delete(ids);
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
	public PageResult search(@RequestBody TbRoleMenu roleMenu, int page, int rows  ){
		return roleMenuService.findPage(roleMenu, page, rows);		
	}
	
}
