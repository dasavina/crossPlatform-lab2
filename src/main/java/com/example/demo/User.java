package com.example.demo;

import java.util.HashMap;

public class User {
    public String login;
    public String region;
    public boolean status;
    public String description;
    public HashMap<Integer, String> friends = new HashMap<>();

    public User(String login, String region, boolean status, String description) {
        this.login = login;
        this.region = region;
        this.status = status;
        this.description = description;
    }
}
