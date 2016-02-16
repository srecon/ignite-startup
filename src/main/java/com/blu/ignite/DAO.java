package com.blu.ignite;

import com.blu.ignite.dao.UserMapper;
import com.blu.ignite.dto.User;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by shamim on 14/02/16.
 */
public class DAO {
    private UserMapper userMapper;

    @Cacheable("returnHello")
    public String sayhello(String str){
        System.out.println("Client says:"+ str);

        return "hello"+str;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public User getUser(String id){
        return userMapper.getUser(id);
    }
}
