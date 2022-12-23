/*
Design a base class shape with two double type values and member functions to input the data
and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make
compute_area() as abstract function and redefine this function in the derived class to suit their
requirements. Write a program that accepts dimensions of triangle/rectangle and display
calculated area. Implement dynamic binding for given case study.
*/

import java.util.Scanner;

abstract class shape{
    double b, h, l, br;

    abstract void compute_area();
}

class triangle extends shape{
    double area;

//    @Override
    void compute_area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base");
        b = sc.nextDouble();
        System.out.println("Enter Height");
        h = sc.nextDouble();

        area = b * h;

        System.out.println("Area of the Assignment4.triangle is : " + area);


    }
}

class rectangle extends shape{
    double area;

    //    @Override
    void compute_area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        l = sc.nextDouble();
        System.out.println("Enter breadth");
        br = sc.nextDouble();

        area = l * br;

        System.out.println("Area of the Assignment4.rectangle is : " + area);
    }
}
public class area
{
    public static void main(String[] args) {
        shape s =  new triangle();
        s.compute_area();

        shape s2  = new rectangle();
        s2.compute_area();
    }
}
