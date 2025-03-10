package man.act.bai.serivce.impl;

import man.act.bai.dao.entry.User;
import man.act.bai.dao.mapper.UserMapper;
import man.act.bai.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Long id) {
        List<User> userList = userMapper.selectList(null);
        User user = userList.stream().findFirst().get();
        return user;
    }

    @Override
    public List<User> getUsers() {
        List<User> userList = userMapper.selectList(null);
        return userList;
    }
}
