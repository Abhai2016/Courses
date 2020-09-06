package com.abhai;

public class BadRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public BadRectangle() {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
    }


    public BadRectangle(int width, int height) {
        x = 0;
        y = 0;
        this.width = width;
        this.height = height;
    }

    public BadRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
