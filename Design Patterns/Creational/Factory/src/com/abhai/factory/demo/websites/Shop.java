package com.abhai.factory.demo.websites;

import com.abhai.factory.demo.pages.CartPage;
import com.abhai.factory.demo.pages.ItemPage;
import com.abhai.factory.demo.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
