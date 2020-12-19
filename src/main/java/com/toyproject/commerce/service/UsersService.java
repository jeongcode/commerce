package com.toyproject.commerce.service;

import com.toyproject.commerce.domain.Users;
import com.toyproject.commerce.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class UsersService{

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> findByUserNoGreaterThanOrderByUserNoUserNoDesc(int userNo){
        List<Users> usersList = new ArrayList<>();
        usersRepository.findByUserNoGreaterThanOrderByUserNoUserNoDesc(userNo).forEach(e -> usersList.add(e));
        return usersList;
    }

    public Optional<Users> findByUserNo(int userNo){
        Optional<Users> users = usersRepository.findById(userNo);
        return users;
    }

    public List<Users> find(){
        List<Users> usersList = new ArrayList<>();
        usersRepository.findAll().forEach(e -> usersList.add(e));
        return usersList;
    }
    public void deleteById(int userNo){
        usersRepository.deleteById(userNo);
    }

    public Users save(Users users){
        usersRepository.save(users);
        return users;
    }

    public void saveTenThousand(){
        Random rand = new Random();
        for(int i = 0 ; i < 10 ; i++) {
            int iValue = rand.nextInt(10);  // 0 <= iValue < 10
            usersRepository.save(new Users(0,"test" + iValue , iValue));
        }
    }
}
