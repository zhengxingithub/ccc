package com.tecode.dao;

import com.tecode.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<User> login(User user) {
        return hibernateTemplate.findByExample(user);
    }
//
//    public List<User> query(String username,String nikname) {
//        String sql = "SELECT `username`,`nikname` FROM `user` WHERE 1 = 1";
//        if (username != null && !"".equals(username)) {
//            sql = sql + " AND username like '%" + username + "%'";
//        }
//        if (nikname != null && !"".equals(nikname)) {
//            sql = sql + " AND address like '%" + nikname + "%'";
//        }
//
//        sql = sql + ";";
//        return super.getlist(sql);
//
//    }
}