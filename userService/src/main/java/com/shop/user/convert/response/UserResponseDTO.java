package com.shop.user.convert.response;

/**
 * @author: langzhifa
 * Date: 2019/7/21
 * Time: 11:25
 * Description:
 */
public class UserResponseDTO {

    String userName;

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
                ", sex=" + sex +
                ", idCard='" + idCard + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
