package com.iiht.stock.repository;

import com.iiht.stock.entity.eMartSellerEntity;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.iiht.stock.entity.eMartSellerEntity;


@Repository
public interface SellerRepository extends JpaRepository<eMartSellerEntity, Integer>{

	public eMartSellerEntity findById(Integer id);
	public eMartSellerEntity findByUserName(String userName);

	@Modifying
	@Transactional
	@Query(value = "update s_user u set u.conformed='1' where u.id=?",nativeQuery = true)
	public int activeUser(@Param("id") Integer id);
}
