package com.blu.ignite;

import com.blu.ignite.dao.UserServices;
import com.blu.ignite.dto.User;
import com.blu.ignite.dto.UserObject;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by shamim on 14/02/16.
 */
@WebService(name = "BusinessRulesServices",
        serviceName="BusinessRulesServices",
        targetNamespace = "http://com.blu.rules/services")
public class WebServices {
    private UserServices userServices;

    @WebMethod(operationName = "getUserName")
    public String getUserName(String userId){
        User user = userServices.getUser(userId);
        return user.getuName();
    }
    @WebMethod(operationName = "getUserObject")
    public UserObject getUserObject(String objectName){
        return userServices.getUserObject(objectName);
    }
    @WebMethod(operationName = "getUniqueJobs")
    public List<String> getUniqueJobs(){
        return userServices.getUniqueJobs();
    }
    @WebMethod(exclude = true)
    public void setDao(UserServices userServices){
        this.userServices = userServices;
    }
    public String allObjectCount(){
        return userServices.allObjectCount();
    }

}
