package com.example.admin.genericbottombarshowhide;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListResponse {
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("contactList")
    @Expose
    private List<ListModel> contactList = null;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<ListModel> getContactList() {
        return contactList;
    }

    public void setContactList(List<ListModel> contactList) {
        this.contactList = contactList;
    }
}
