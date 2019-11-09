package cn.zyj.Service;

import cn.zyj.pojo.User;
import cn.zyj.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id){
        return  userMapper.findById(id);
    }
}
