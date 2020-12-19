package com.toyproject.commerce.repository;

import com.toyproject.commerce.domain.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users , Integer> {

    public List<Users> findByUserNoGreaterThanOrderByUserNoUserNoDesc(@Param("userNo") int userNo);

    @Query("select userNo,userNm,userSortNum from Users where userNo >: userNo")
    public List<Users> findByUserNoThanSQL(@Param("userNo") int userNo);

}