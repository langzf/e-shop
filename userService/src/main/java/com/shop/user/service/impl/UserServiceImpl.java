package com.shop.user.service.impl;

import com.shop.user.convert.request.UserRequestDTO;
import com.shop.user.convert.response.UserResponseDTO;
import com.shop.user.dao.UserMapper;
import com.shop.user.entity.UserDO;
import com.shop.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: langzhifa
 * Date: 2019/7/21
 * Time: 11:31
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Integer createUser(UserRequestDTO userDTO) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userDTO,userDO);
        userMapper.createUser(userDO);
        return userDO.getId();
    }
}
