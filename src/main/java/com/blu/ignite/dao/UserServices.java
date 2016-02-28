package com.blu.ignite.dao;

import com.blu.ignite.dto.User;
import com.blu.ignite.dto.UserObject;
import com.blu.ignite.mapper.UserMapper;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by shamim on 16/02/16.
 */
public class UserServices {
    private UserMapper userMapper;


    @Cacheable("returnHello")
    public String sayhello(String str){
        System.out.println("Client says:"+ str);

        return "hello"+str;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public UserObject getUserObject(String objectName){
        return userMapper.getUserObject(objectName);
    }
    public User getUser(String id){
        return userMapper.getUser(id);
    }
    public List<String> getUniqueJobs(){
        return userMapper.getUniqueJob();
    }
    public String allObjectCount(){
        return userMapper.allObjectCount();
    }
}
