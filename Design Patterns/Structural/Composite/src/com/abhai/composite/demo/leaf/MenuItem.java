package com.abhai.composite.demo.leaf;

import com.abhai.composite.demo.component.MenuComponent;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
