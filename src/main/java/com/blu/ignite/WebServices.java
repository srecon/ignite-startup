package com.blu.ignite;

import com.blu.ignite.dao.UserServices;
import com.blu.ignite.dto.User;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by shamim on 14/02/16.
 */
@WebService(name = "BusinessRulesServices",
        serviceName="BusinessRulesServices",
        targetNamespace = "http://com.blu.rules/services")
public class WebServices {
    private UserServices userServices;

    @WebMethod(operationName = "uftpRules")
    public String sayHello(String str){
        User user = userServices.getUser(str);
        return user.getuName();
    }
    @WebMethod(exclude = true)
    public void setDao(UserServices userServices){
        this.userServices = userServices;
    }

}
