package com.lzz.potato.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lzz.potato.dao.TbPersonMapper;
import com.lzz.potato.pojo.TbPerson;
import com.lzz.potato.pojo.TbPersonExample;
import com.lzz.potato.pojo.TbPersonExample.Criteria;
import com.lzz.potato.service.PersonService;
import com.lzz.potato.util.PageResult;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private TbPersonMapper personMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbPerson> findAll() {
		return personMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbPerson> page=   (Page<TbPerson>) personMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbPerson person) {
		personMapper.insert(person);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbPerson person){
		personMapper.updateByPrimaryKey(person);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbPerson findOne(Integer id){
		return personMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			personMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbPerson person, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbPersonExample example=new TbPersonExample();
		Criteria criteria = example.createCriteria();
		
		if(person!=null){			
						if(person.getpPassword()!=null && person.getpPassword().length()>0){
				criteria.andPPasswordLike("%"+person.getpPassword()+"%");
			}
			if(person.getpSalt()!=null && person.getpSalt().length()>0){
				criteria.andPSaltLike("%"+person.getpSalt()+"%");
			}
			if(person.getpLocation()!=null && person.getpLocation().length()>0){
				criteria.andPLocationLike("%"+person.getpLocation()+"%");
			}
			if(person.getpName()!=null && person.getpName().length()>0){
				criteria.andPNameLike("%"+person.getpName()+"%");
			}
			if(person.getpHome()!=null && person.getpHome().length()>0){
				criteria.andPHomeLike("%"+person.getpHome()+"%");
			}
			if(person.getpSchool()!=null && person.getpSchool().length()>0){
				criteria.andPSchoolLike("%"+person.getpSchool()+"%");
			}
			if(person.getpEdu()!=null && person.getpEdu().length()>0){
				criteria.andPEduLike("%"+person.getpEdu()+"%");
			}
			if(person.getpMajor()!=null && person.getpMajor().length()>0){
				criteria.andPMajorLike("%"+person.getpMajor()+"%");
			}
			if(person.getpWork()!=null && person.getpWork().length()>0){
				criteria.andPWorkLike("%"+person.getpWork()+"%");
			}
			if(person.getpQuali()!=null && person.getpQuali().length()>0){
				criteria.andPQualiLike("%"+person.getpQuali()+"%");
			}
			if(person.getpIdentity()!=null && person.getpIdentity().length()>0){
				criteria.andPIdentityLike("%"+person.getpIdentity()+"%");
			}
			if(person.getpLevel()!=null && person.getpLevel().length()>0){
				criteria.andPLevelLike("%"+person.getpLevel()+"%");
			}
			if(person.getpType()!=null && person.getpType().length()>0){
				criteria.andPTypeLike("%"+person.getpType()+"%");
			}
			if(person.getpExtra()!=null && person.getpExtra().length()>0){
				criteria.andPExtraLike("%"+person.getpExtra()+"%");
			}
			
	
		}
		
		Page<TbPerson> page= (Page<TbPerson>)personMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
