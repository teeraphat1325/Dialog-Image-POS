/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.werapan.databaseproject.service;

import com.werapan.databaseproject.dao.UserDao;
import com.werapan.databaseproject.model.User;
import java.util.List;

/**
 *
 * @author werapan
 */
public class UserService {
    public User login(String login, String password) {
        UserDao userDao = new UserDao();
        User user = userDao.getByLogin(login);
        if(user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    
    public List<User> getUser(){
        UserDao userDao = new UserDao();
        return userDao.getAll(" user_login asc");
    }

    public User addNew(User editUser) {
        UserDao userdao = new UserDao();
        return userdao.save(editUser);
    }

    public User update(User editUser) {
        UserDao userdao = new UserDao();
        return userdao.update(editUser);
    }

    public int delete(User editUser) {
        UserDao userdao = new UserDao();
        return userdao.delete(editUser);
    }
  
}
