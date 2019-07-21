package com.shop.user.service;

import com.shop.user.convert.request.UserRequestDTO;
import com.shop.user.convert.response.UserResponseDTO;

/**
 * @author: langzhifa
 * Date: 2019/7/21
 * Time: 11:20
 * Description:
 */
public interface UserService {
    /**
     * 创建用户
     * @param userDTO
     * @return
     */
    Integer createUser(UserRequestDTO userDTO);

}
