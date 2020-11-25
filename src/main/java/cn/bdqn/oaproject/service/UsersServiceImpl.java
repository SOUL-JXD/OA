package cn.bdqn.oaproject.service;

import cn.bdqn.oaproject.dao.UsersDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService{
    @Resource
    private UsersDao userdao;
    public int findCount() {
        return userdao.findCount();
    }
}
