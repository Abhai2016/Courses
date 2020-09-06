package com.abhai.factory.demo;

import com.abhai.factory.demo.websites.Blog;
import com.abhai.factory.demo.websites.Shop;
import com.abhai.factory.demo.websites.Website;
import com.abhai.factory.demo.websites.WebsiteType;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType websiteType) {
        switch(websiteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
