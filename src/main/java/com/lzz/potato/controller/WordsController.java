package com.lzz.potato.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lzz.potato.pojo.TbWords;
import com.lzz.potato.service.WordsService;
import com.lzz.potato.util.PageResult;
import com.lzz.potato.util.Result;


/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/words")
public class WordsController {

	@Autowired
	private WordsService wordsService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbWords> findAll(){			
		return wordsService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return wordsService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param words
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbWords words){
		try {
			wordsService.add(words);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param words
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbWords words){
		try {
			wordsService.update(words);
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
	public TbWords findOne(Integer id){
		return wordsService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Integer [] ids){
		try {
			wordsService.delete(ids);
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
	public PageResult search(@RequestBody TbWords words, int page, int rows  ){
		return wordsService.findPage(words, page, rows);		
	}
	
}
