package com.pc.collabtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.collabtest.dao.UserDAOImpl;

@Service("userService")
public class UserService implements ServiceFacade {
     
    @Autowired
    private UserDAOImpl userDAO;
     
    public Object doService(Object... args) throws Exception {
        if(args[0].equals("insert")){
            userDAO.insertBatch();
            return true;
        }else{
            return userDAO.getUsers();
        }
    }
}