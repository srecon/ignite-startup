package com.blu.ignite.mapper;

import com.blu.ignite.dto.User;

/**
 * Created by shamim on 15/02/16.
 */
public interface UserMapper {
    //@Select("findById")
    //User getUser(@Param("id") String userId);
    User getUser( String id);
}
