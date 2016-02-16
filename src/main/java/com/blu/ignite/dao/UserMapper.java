package com.blu.ignite.dao;

import com.blu.ignite.dto.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by shamim on 15/02/16.
 */
public interface UserMapper {
    //@Select("findById")
    //User getUser(@Param("id") String userId);
    User getUser( String id);
}
