package com.blu.ignite;

import com.blu.ignite.dao.UserMapper;
import com.blu.ignite.dto.User;
import org.springframework.cache.annotation.Cacheable;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by shamim on 14/02/16.
 */
@WebService(name = "BusinessRulesServices",
        serviceName="BusinessRulesServices",
        targetNamespace = "http://com.blu.rules/services")
public class Services{
    private DAO dao;

    @WebMethod(operationName = "uftpRules")
    public String sayHello(String str){
        //return dao.sayhello (str);
        User user = dao.getUser(str);
        return user.getuName();
    }
    @WebMethod(exclude = true)
    public void setDao(DAO dao){
        this.dao = dao;
    }

}
