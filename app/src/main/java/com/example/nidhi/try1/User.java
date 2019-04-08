package com.example.nidhi.try1;

/**
 * Created by nidhi on 31-01-2018.
 */

class User {
    private String DisplayName;


    private String Email;
    private long createdAt;

    public User (){};
    public User(String displayname,String email,long createdAt){
        this.DisplayName=displayname;
       this.Email=email;
        this.createdAt=createdAt;
    }


    public String getDisplayName() {
        return DisplayName;
    }

    public String getEmail() {
        return Email;
    }

    public long getCreatedAt() {
        return createdAt;
    }

}
