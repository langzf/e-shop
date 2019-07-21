package com.shop.user.convert.request;

import java.io.Serializable;

/**
 * @author: langzhifa
 * Date: 2019/7/21
 * Time: 11:25
 * Description:
 */
public class UserRequestDTO {

    String userName;

    String password;

    Integer sex;

    String idCard;

    String address;

    String phone;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserRequestDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", idCard='" + idCard + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
