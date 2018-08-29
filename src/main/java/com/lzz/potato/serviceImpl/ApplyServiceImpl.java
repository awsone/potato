package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbApplyMapper;
import com.lzz.potato.pojo.TbApply;
import com.lzz.potato.pojo.TbApplyExample;
import com.lzz.potato.pojo.TbApplyExample.Criteria;
import com.lzz.potato.service.ApplyService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class ApplyServiceImpl implements ApplyService {

	@Autowired
	private TbApplyMapper applyMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbApply> findAll() {
		return applyMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbApply> page=   (Page<TbApply>) applyMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbApply apply) {
		applyMapper.insert(apply);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbApply apply){
		applyMapper.updateByPrimaryKey(apply);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbApply findOne(Integer id){
		return applyMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			applyMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbApply apply, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbApplyExample example=new TbApplyExample();
		Criteria criteria = example.createCriteria();
		
		if(apply!=null){			
						if(apply.getaName()!=null && apply.getaName().length()>0){
				criteria.andANameLike("%"+apply.getaName()+"%");
			}
			if(apply.getaType()!=null && apply.getaType().length()>0){
				criteria.andATypeLike("%"+apply.getaType()+"%");
			}
			if(apply.getaLocation()!=null && apply.getaLocation().length()>0){
				criteria.andALocationLike("%"+apply.getaLocation()+"%");
			}
			if(apply.getaLeader()!=null && apply.getaLeader().length()>0){
				criteria.andALeaderLike("%"+apply.getaLeader()+"%");
			}
			if(apply.getaContent()!=null && apply.getaContent().length()>0){
				criteria.andAContentLike("%"+apply.getaContent()+"%");
			}
			if(apply.getaExtra()!=null && apply.getaExtra().length()>0){
				criteria.andAExtraLike("%"+apply.getaExtra()+"%");
			}
			if(apply.getaFile()!=null && apply.getaFile().length()>0){
				criteria.andAFileLike("%"+apply.getaFile()+"%");
			}
			if(apply.getaFirstOpinion()!=null && apply.getaFirstOpinion().length()>0){
				criteria.andAFirstOpinionLike("%"+apply.getaFirstOpinion()+"%");
			}
			if(apply.getaFirstOpinion()!=null && apply.getaFirstOpinion().length()>0){
				criteria.andALeaderOpinionLike("%"+apply.getaFirstOpinion()+"%");
			}
			if(apply.getaFlag()!=null && apply.getaFlag().length()>0){
				criteria.andAFlagLike("%"+apply.getaFlag()+"%");
			}
	
		}
		
		Page<TbApply> page= (Page<TbApply>)applyMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
