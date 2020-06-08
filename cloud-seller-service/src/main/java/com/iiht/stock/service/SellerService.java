package com.iiht.stock.service;

import com.iiht.stock.entity.eMartSellerEntity;
import java.util.List;
import org.springframework.data.domain.Page;

public interface SellerService {
  public Page<eMartSellerEntity> findAll(int page, int pageSize);

  public List<eMartSellerEntity> findAllUsers();

  public eMartSellerEntity findUserById(Integer id);

  public eMartSellerEntity findUserByUserName(String userName);

  public void delete(Integer id);
}
