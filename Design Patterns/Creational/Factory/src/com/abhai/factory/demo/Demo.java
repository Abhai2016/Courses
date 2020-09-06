package com.abhai.factory.demo;

import com.abhai.factory.demo.websites.Website;
import com.abhai.factory.demo.websites.WebsiteType;

public class Demo {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
