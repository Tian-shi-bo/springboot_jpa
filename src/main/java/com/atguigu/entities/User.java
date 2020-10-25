package com.atguigu.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author tian
 * @date 2020/10/22 13:05
 */

//  O - R - Mapping  对象和关系表之间的映射

// PO   Entity  Class   bean   pojo   do
//与表进行映射的类, 一般称为实体域对象(只封装属性).   过程域对象(只封装方法)
@Entity  //声明当前的类为实体类
@Table(name = "t_user")  //映射出一个表 t_user
public class User implements Serializable { //封装数据   Serializable实现序列化

    @Id  //声明注解
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // GenerationType.IDENTITY连接mysql主键生成策略  GenerationType.AUTO 自适应生成
    private Integer id;

    @Column(name = "username" ,nullable = false,length = 16)  //指定字段属性 nullable = false不允许为空  length = 16长度为 16个字符
    private String username;

    public User( String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Column(name = "password") 默认与属性名一致 可不加注释
    private String password;

    private String name;
}
