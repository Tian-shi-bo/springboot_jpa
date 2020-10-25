package com.atguigu.dao;

import com.atguigu.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tian
 * @date 2020/10/22 13:24
 */
// DAO 继承了JpaRepository接口，接口中就已经含有了基本的  CRUD 操作了
public interface UserDao extends JpaRepository<User,Integer> {

}
