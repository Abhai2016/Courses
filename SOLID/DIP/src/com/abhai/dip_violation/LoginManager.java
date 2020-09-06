package com.abhai.dip_violation;

public class LoginManager {
    SimpleLogin simpleLogin = new SimpleLogin();

    public void login(User user) {
        simpleLogin.authenticate(user);
    }
}
