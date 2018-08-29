package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbWordsMapper;
import com.lzz.potato.pojo.TbWords;
import com.lzz.potato.pojo.TbWordsExample;
import com.lzz.potato.pojo.TbWordsExample.Criteria;
import com.lzz.potato.service.WordsService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class WordsServiceImpl implements WordsService {

	@Autowired
	private TbWordsMapper wordsMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbWords> findAll() {
		return wordsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbWords> page=   (Page<TbWords>) wordsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbWords words) {
		wordsMapper.insert(words);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbWords words){
		wordsMapper.updateByPrimaryKey(words);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbWords findOne(Integer id){
		return wordsMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			wordsMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbWords words, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbWordsExample example=new TbWordsExample();
		Criteria criteria = example.createCriteria();
		
		if(words!=null){			
						if(words.getWsContent()!=null && words.getWsContent().length()>0){
				criteria.andWsContentLike("%"+words.getWsContent()+"%");
			}
			if(words.getWsReply()!=null && words.getWsReply().length()>0){
				criteria.andWsReplyLike("%"+words.getWsReply()+"%");
			}
			if(words.getWsSendTime()!=null && words.getWsSendTime().length()>0){
				criteria.andWsSendTimeLike("%"+words.getWsSendTime()+"%");
			}
			if(words.getWsReplyTime()!=null && words.getWsReplyTime().length()>0){
				criteria.andWsReplyTimeLike("%"+words.getWsReplyTime()+"%");
			}
	
		}
		
		Page<TbWords> page= (Page<TbWords>)wordsMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
