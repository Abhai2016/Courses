package com.abhai.dip_solution;

// High level class

public class LoginManager {
    Authenticator authenticator;


    public LoginManager(Authenticator authenticator) {
        this.authenticator = authenticator;
    }


    public void login(User user) {
        authenticator.authenticate(user);
    }
}
