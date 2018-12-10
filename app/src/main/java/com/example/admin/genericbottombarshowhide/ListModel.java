package com.example.admin.genericbottombarshowhide;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListModel {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("emp_id")
    @Expose
    private String empId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("countrycode")
    @Expose
    private String countrycode;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("webaddress")
    @Expose
    private String webaddress;
    @SerializedName("birthday")
    @Expose
    private String birthday;
    @SerializedName("mph")
    @Expose
    private String mph;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("additional")
    @Expose
    private String additional;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWebaddress() {
        return webaddress;
    }

    public void setWebaddress(String webaddress) {
        this.webaddress = webaddress;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}
