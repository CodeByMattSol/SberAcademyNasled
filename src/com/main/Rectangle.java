package com.main;

public class Rectangle {
    float height;
    float width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float calcArea() {
        return height*width;
    }
}
