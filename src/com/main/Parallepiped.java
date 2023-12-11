package com.main;

public class Parallepiped extends Rectangle {
    public float line;

    public Parallepiped(float height, float width, float line) {
        super(height, width);
        this.line = line;
    }

    @Override
    public float calcArea() {
        return 2 * (width * height + width * line + line * height);
    }

    public float calcVolume() {
        return super.calcArea() * line;
    }

}
