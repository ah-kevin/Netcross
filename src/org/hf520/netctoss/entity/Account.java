package org.hf520.netctoss.entity;

import java.io.Serializable;
import java.sql.Date;

import java.sql.Timestamp;

/**
 * Created by kevin on 2015/1/9.
 */
public class Account implements Serializable {
    /*
        * 账务账号Id
        */
    private Integer id;
    /*
     * 推荐人Id
     */
    private Integer recommendId;
    private String login_name;
    private String login_Password;
    private String status;
    private Date create_date;
    private Date pause_date;
    private Date colse_date;
    private String real_name;
    private String idcard_no;
    private Date birthdate;
    private String gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Integer recommendId) {
        this.recommendId = recommendId;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getLogin_Password() {
        return login_Password;
    }

    public void setLogin_Password(String login_Password) {
        this.login_Password = login_Password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getPause_date() {
        return pause_date;
    }

    public void setPause_date(Date pause_date) {
        this.pause_date = pause_date;
    }

    public Date getColse_date() {
        return colse_date;
    }

    public void setColse_date(Date colse_date) {
        this.colse_date = colse_date;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getIdcard_no() {
        return idcard_no;
    }

    public void setIdcard_no(String idcard_no) {
        this.idcard_no = idcard_no;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Timestamp getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Timestamp last_login_time) {
        this.last_login_time = last_login_time;
    }

    private String occupation;
    private String telephone;
    private String email;
    private String mailAddress;
    private String zipCode;
    private String  qq;
    private Timestamp last_login_time;

}
