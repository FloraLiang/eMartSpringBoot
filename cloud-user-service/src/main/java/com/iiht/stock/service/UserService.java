package com.iiht.stock.service;

import com.iiht.stock.entity.eMartUserEntity;
import java.util.List;

import org.springframework.data.domain.Page;

import com.iiht.stock.entity.eMartUserEntity;

public interface UserService {

	public Page<eMartUserEntity> findAll(int page, int pageSize);
	
	public List<eMartUserEntity> findAllUsers();
	
	public eMartUserEntity findUserById(Integer id);
	
	public eMartUserEntity findUserByUserName(String userName);
	
	public eMartUserEntity registUser(eMartUserEntity user);


	public eMartUserEntity updateUser(eMartUserEntity user);
	
	public eMartUserEntity activeUser(Integer id);
	
	public void delete(Integer id);
	
}
