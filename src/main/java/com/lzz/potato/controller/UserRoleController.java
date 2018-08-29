package com.lzz.potato.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzz.potato.pojo.TbUserRole;
import com.lzz.potato.service.UserRoleService;
import com.lzz.potato.util.PageResult;
import com.lzz.potato.util.Result;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/userRole")
public class UserRoleController {

	@Autowired
	private UserRoleService userRoleService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbUserRole> findAll(){			
		return userRoleService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return userRoleService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param userRole
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbUserRole userRole){
		try {
			userRoleService.add(userRole);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param userRole
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbUserRole userRole){
		try {
			userRoleService.update(userRole);
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
	public TbUserRole findOne(Integer id){
		return userRoleService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			userRoleService.delete(ids);
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
	public PageResult search(@RequestBody TbUserRole userRole, int page, int rows  ){
		return userRoleService.findPage(userRole, page, rows);		
	}
	
}
