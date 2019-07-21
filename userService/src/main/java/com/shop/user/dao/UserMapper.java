package com.shop.user.dao;

import com.shop.user.entity.UserDO;
import org.springframework.stereotype.Repository;

/**
 * @author: langzhifa
 * Date: 2019/7/21
 * Time: 11:40
 * Description:
 */
@Repository
public interface UserMapper {

    Long createUser(UserDO userDO);
}
