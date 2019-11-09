package cn.zyj.Mapper;

import cn.zyj.pojo.User;

import javax.annotation.PreDestroy;


public interface UserMapper {
    public User findById(Integer id);
}
