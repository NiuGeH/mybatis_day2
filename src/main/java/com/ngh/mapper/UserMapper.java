package com.ngh.mapper;

import com.ngh.po.User;
import com.ngh.po.UserComte;
import com.ngh.po.userQueryVo;

import java.util.List;

public interface UserMapper {

    public User findUserById(Integer id);

    List<UserComte> findUserList(userQueryVo userQueryVo);

    void insertUser(User user);

    void delUserById(Integer id);

    void updateUser(UserComte userComte);

    List<UserComte> findUserWhere(userQueryVo queryVo);
}
