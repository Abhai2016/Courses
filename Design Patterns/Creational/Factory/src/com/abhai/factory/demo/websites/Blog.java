package com.abhai.factory.demo.websites;

import com.abhai.factory.demo.pages.AboutPage;
import com.abhai.factory.demo.pages.CommentPage;
import com.abhai.factory.demo.pages.ContactPage;
import com.abhai.factory.demo.pages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
