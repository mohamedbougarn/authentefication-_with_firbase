package com.example.minprojetandroid;

public class User
{
    private String email;
    private String fullName;
    private String profession;
    private String workplace;
    private String phone;
    private String password;
    private String sex;

    public User()
    {
    }


    public User(String email, String fullName) {
        this.email = email;
        this.fullName = fullName;
    }

    public User(String fullName, String email, String profession, String workplace, String phone) {
        this.fullName = fullName;
        this.email = email;

        this.profession = profession;
        this.workplace = workplace;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
