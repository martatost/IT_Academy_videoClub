package com.martaTostSoft;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private String surname;
    private String password;
    private Date registrationDate;
    private List<Video> videoList;

    public User(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.registrationDate = new Date();
        this.videoList = new ArrayList<>();
    }

    public void AddNewVideo(Video video) {
        this.videoList.add(video);
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
