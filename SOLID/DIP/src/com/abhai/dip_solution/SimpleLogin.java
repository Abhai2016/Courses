package com.abhai.dip_solution;

// low level class

public class SimpleLogin implements Authenticator {
    @Override
    public boolean authenticate(User user)
    {
        // logic - database
        return true;
    }
}
