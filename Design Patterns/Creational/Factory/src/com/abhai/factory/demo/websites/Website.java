package com.abhai.factory.demo.websites;

import com.abhai.factory.demo.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();


    public Website() {
       createWebsite();
    }

    public abstract void createWebsite();


    public List<Page> getPages() {
        return pages;
    }
}
