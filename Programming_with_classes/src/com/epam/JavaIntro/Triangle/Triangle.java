package com.epam.JavaIntro.Triangle;

import java.util.Objects;

public class Triangle {
    private int a;
    private int b;
    private int c;

    private double a1;
    private double a2;
    private double b1;
    private double b2;
    private double c1;
    private double c2;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
  
    public Triangle(int a1, int a2, int b1, int b2, int c1, int c2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        this.c1 = c1;
        this.c2 = c2;
    }

        public void perimeter() {
            System.out.println("Периметр треугольника: ");
            System.out.println( a + b + c);
        }
  
        public void area() {
        int pp = (a + b + c)/ 2;
            System.out.println("Периметр треугольника: ");
            System.out.println((int) Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)));
    }
  
    public void medianIntersection() {
        System.out.println("Точки пересечения медиан: ");
        double d1 = (a1 + b1 + c1)/ 3;
        double d2 = (a2 + b2 + c2)/ 3;
        System.out.println((Math.round(d1) + ", " + Math.round(d2)));

}

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }
    
}
