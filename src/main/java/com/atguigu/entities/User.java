package com.atguigu.entities;

import javax.persistence.*;
import java.io.Serializable;

// JPA  Java Persistence API

// O - R Mapping  对象和关系表之间的映射

// PO     Entity Class    bean   pojo     do
// 与表进行映射的类，一般称为 实体域对象。
@Entity //声明当前类为一个实体类
@Table(name = "t_user")
public class User implements Serializable { //封装数据

    @Id //声明注解
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 主键生成策略
    private Integer id ;

    @Column(name = "username",nullable = false,length = 16)
    private String username ;

    //@Column(name = "password")
    private String password;

    //@Column(name = "name")
    private String name;

    public User() {
    }

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
