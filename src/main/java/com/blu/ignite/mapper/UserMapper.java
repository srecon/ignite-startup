package com.blu.ignite.mapper;

import com.blu.ignite.dto.User;
import com.blu.ignite.dto.UserObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by shamim on 15/02/16.
 */
public interface UserMapper {
    //User getUser(@Param("id") String userId);
    User getUser( String id);
    List<String> getUniqueJob();
    UserObject getUserObject(String objectName);
    String allObjectCount();
}
