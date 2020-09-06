package com.abhai;

public class GoodRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public GoodRectangle() {
        this(0, 0);
    }

    public GoodRectangle(int width, int height) {
        this(0, 0, width, height);
    }

    public GoodRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
