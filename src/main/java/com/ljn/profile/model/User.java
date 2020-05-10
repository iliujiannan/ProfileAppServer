package com.ljn.profile.model;

import com.sun.istack.internal.NotNull;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

@Table(value = "user")
public class User {

    @Id(auto = true)
    @Column(value = "id")
    private int mUserId = -1;

    @NotNull
    @Column(value = "phone_number")
    private String mPhoneNumber = "";

    @NotNull
    @Column(value = "name")
    private String mName = "";

    @NotNull
    @Column(value = "photo_path")
    private String mPhoto = "";

    @Column(value = "sex")
    private int mSex = -1;

    @Column(value = "age")
    private int mAge = 0;

    @NotNull
    @Column(value = "nation")
    private String mNation = "";

    public int getUserId() {
        return mUserId;
    }

    public void setUserId(int userId) {
        mUserId = userId;
    }

    @NotNull
    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(@NotNull String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    @NotNull
    public String getName() {
        return mName;
    }

    public void setName(@NotNull String name) {
        mName = name;
    }

    @NotNull
    public String getPhoto() {
        return mPhoto;
    }

    public void setPhoto(@NotNull String photo) {
        mPhoto = photo;
    }

    public int getSex() {
        return mSex;
    }

    public void setSex(int sex) {
        mSex = sex;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    @NotNull
    public String getNation() {
        return mNation;
    }

    public void setNation(@NotNull String nation) {
        mNation = nation;
    }
}
