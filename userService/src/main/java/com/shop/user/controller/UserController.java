package com.shop.user.controller;

import com.shop.user.convert.request.UserRequestDTO;
import com.shop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: langzhifa
 * Date: 2019/7/21
 * Time: 11:13
 * Description:
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/createUser")
    @ResponseBody
    public Integer createUser(@RequestBody UserRequestDTO userDTO){
        return  userService.createUser(userDTO);
    }

}
