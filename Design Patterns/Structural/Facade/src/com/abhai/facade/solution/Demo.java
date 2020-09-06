package com.abhai.facade.solution;

import com.abhai.facade.solution.facade.JdbcFacade;
import com.abhai.facade.solution.model.Address;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        JdbcFacade jdbcFacade = new JdbcFacade();
        jdbcFacade.createTable();
        jdbcFacade.insertIntoTable();
        List<Address> addresses = jdbcFacade.getAddresses();

        for(Address address : addresses)
            System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
    }
}
