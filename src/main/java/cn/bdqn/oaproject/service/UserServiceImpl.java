package cn.bdqn.oaproject.service;

import cn.bdqn.oaproject.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UsersDao usersDao;
    @Override
    public int findCount() {
        return usersDao.findCount();
    }
}
