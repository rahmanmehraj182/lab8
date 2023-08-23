/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalab8;

import java.util.Scanner;

/**
 *
 * @author Student
 */
class IllegalTriangleException extends Exception {

    IllegalTriangleException(String a) {
        super(a);
    }
}

class GeometricObject {

    private boolean filled;
    private String color;

    public void setFill(boolean a) {
        this.filled = a;
    }

    public void setColor(String a) {
        this.color = a;
    }

}

class triangle extends GeometricObject {

    private double s1, s2, s3;

    triangle() {
        this.s1 = 1.0;
        this.s2 = 1.0;
        this.s3 = 1.0;
    }

    triangle(double a, double b, double c, String col, boolean t) throws IllegalTriangleException {

        if (a + b >= c && b + c >= a && c + a >= b) {
            this.s1 = a;
            this.s2 = b;
            this.s3 = c;
            super.setColor(col);
            super.setFill(t);

        } else {
            throw new IllegalTriangleException("Triangle can't be made!");
        }

    }

    public double geta() {
        return this.s1;
    }

    public double getb() {
        return this.s2;
    }

    public double getc() {
        return this.s3;
    }

    public double getArea() {

        double diam = (this.s1 + this.s2 + this.s3) / 2;
        double sqArea = diam * (diam - this.s1) * (diam - this.s2) * (diam - this.s3);
        double area = Math.sqrt(sqArea);
        return area;
    }

    public double getPerimeter() {

        double diam = (this.s1 + this.s2 + this.s3);

        return diam;
    }

    public String toString() {

        String a = "Triangle : side 1 : " + this.s1 + " Side 2 : " + this.s2 + "Side 3 :" + this.s3;

        return a;
    }

}

public class Problem4 {

    public static void main(String[] args) {
        double a, b, c;
        String col;
        boolean t;
        Scanner inp = new Scanner(System.in);
        a = inp.nextDouble();
        b = inp.nextDouble();
        c = inp.nextDouble();
        col = inp.next();
        t = inp.nextBoolean();

        try {
            triangle aaa = new triangle(a, b, c, col, t);
            System.out.println(aaa.toString());
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }

    }
}
