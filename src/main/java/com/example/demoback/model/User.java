package com.example.demoback.model;

import java.sql.Timestamp;

import javax.swing.text.PasswordView;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long s_id;
    private String v_user;
    private String v_name;
    private String v_pass;
    private Integer i_enabled;
    private String v_email;
    private Integer i_profile;
    private Timestamp t_creation_date;

    public User(){

    }
    

    public User(String v_user, String v_name, String v_pass, Integer i_enabled, String v_email,
            Integer i_profile, Timestamp t_creation_date, Stakeholder t_stakeholder) {
        this.v_user = v_user;
        this.v_name = v_name;
        this.v_pass = v_pass;
        this.i_enabled = i_enabled;
        this.v_email = v_email;
        this.i_profile = i_profile;
        this.t_creation_date = t_creation_date;
    }



    public Long getS_id() {
        return s_id;
    }

    public void setS_id(Long s_id) {
        this.s_id = s_id;
    }

    public String getV_user() {
        return v_user;
    }

    public void setV_user(String v_user) {
        this.v_user = v_user;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_pass() {
        return v_pass;
    }

    public void setV_pass(String v_pass) {
        this.v_pass = v_pass;
    }

    public Integer getI_enabled() {
        return i_enabled;
    }

    public void setI_enabled(Integer i_enabled) {
        this.i_enabled = i_enabled;
    }

    public String getV_email() {
        return v_email;
    }

    public void setV_email(String v_email) {
        this.v_email = v_email;
    }

    public Integer getI_profile() {
        return i_profile;
    }

    public void setI_profile(Integer i_profile) {
        this.i_profile = i_profile;
    }

    public Timestamp getT_creation_date() {
        return t_creation_date;
    }

    public void setT_creation_date(Timestamp t_creation_date) {
        this.t_creation_date = t_creation_date;
    }
    

}
