package com.example.demoback.model;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
@Table(name = "t_stakeholder")
public class Stakeholder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long b_id;
    private String b_documen_type;
    private String v_documen_number;
    private String v_first_name;
    private String v_second_name;
    private String v_first_surname;
    private String v_second_surname;
    private String v_full_name;
    private Date d_date_birth;
    private String v_city;
    private Integer i_sex;
    private Integer i_enable;
    
    @ManyToOne
    @JoinColumn(name="i_creation_user")
    private User users;

    private Timestamp t_creation_date;



    public Stakeholder(){
        
    }



    public Stakeholder(String b_documen_type, String v_documen_number, String v_first_name, String v_second_name,
            String v_first_surname, String v_second_surname, String v_full_name, Date d_date_birth, String v_city,
            Integer i_sex, Integer i_enable, User users, Timestamp t_creation_date) {
        this.b_documen_type = b_documen_type;
        this.v_documen_number = v_documen_number;
        this.v_first_name = v_first_name;
        this.v_second_name = v_second_name;
        this.v_first_surname = v_first_surname;
        this.v_second_surname = v_second_surname;
        this.v_full_name = v_full_name;
        this.d_date_birth = d_date_birth;
        this.v_city = v_city;
        this.i_sex = i_sex;
        this.i_enable = i_enable;
        this.users = users;
        this.t_creation_date = t_creation_date;
    }





    public Long getB_id() {
        return b_id;
    }



    public void setB_id(Long b_id) {
        this.b_id = b_id;
    }



    public String getB_documen_type() {
        return b_documen_type;
    }



    public void setB_documen_type(String b_documen_type) {
        this.b_documen_type = b_documen_type;
    }



    public String getV_documen_number() {
        return v_documen_number;
    }



    public void setV_documen_number(String v_documen_number) {
        this.v_documen_number = v_documen_number;
    }



    public String getV_first_name() {
        return v_first_name;
    }



    public void setV_first_name(String v_first_name) {
        this.v_first_name = v_first_name;
    }



    public String getV_second_name() {
        return v_second_name;
    }



    public void setV_second_name(String v_second_name) {
        this.v_second_name = v_second_name;
    }



    public String getV_first_surname() {
        return v_first_surname;
    }



    public void setV_first_surname(String v_first_surname) {
        this.v_first_surname = v_first_surname;
    }



    public String getV_second_surname() {
        return v_second_surname;
    }



    public void setV_second_surname(String v_second_surname) {
        this.v_second_surname = v_second_surname;
    }



    public String getV_full_name() {
        return v_full_name;
    }



    public void setV_full_name(String v_full_name) {
        this.v_full_name = v_full_name;
    }



    public Date getD_date_birth() {
        return d_date_birth;
    }



    public void setD_date_birth(Date d_date_birth) {
        this.d_date_birth = d_date_birth;
    }



    public String getV_city() {
        return v_city;
    }



    public void setV_city(String v_city) {
        this.v_city = v_city;
    }



    public Integer getI_sex() {
        return i_sex;
    }



    public void setI_sex(Integer i_sex) {
        this.i_sex = i_sex;
    }



    public Integer getI_enable() {
        return i_enable;
    }



    public void setI_enable(Integer i_enable) {
        this.i_enable = i_enable;
    }



    public User getUsers() {
        return users;
    }



    public void setUsers(User users) {
        this.users = users;
    }



    public Timestamp getT_creation_date() {
        return t_creation_date;
    }



    public void setT_creation_date(Timestamp t_creation_date) {
        this.t_creation_date = t_creation_date;
    }
    

    

}
