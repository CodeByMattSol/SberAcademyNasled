package com.main;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20f, 30f);

        System.out.println("Площадь прямоугольника: " + rectangle.calcArea());

        Parallepiped parallepiped = new Parallepiped(20f, 30f, 40f);

        System.out.println("Площадь сторон параллепипеда: " + parallepiped.calcArea());
        System.out.println("Объём параллепипеда: " + parallepiped.calcVolume());
    }
}
