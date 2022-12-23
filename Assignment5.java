/*
Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way.
*/

import java.util.Scanner;

interface Vehicle{
    public void gearChange();
    public void speedUp();
    public void applyBreaks();
}

class Bike implements Vehicle{
    int gear;
    int breaks;
    int speed;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gear number : ");
        this.gear =sc.nextInt();

        System.out.println("Enter 1 if breaks are applied else enter 0: ");
        this.breaks =sc.nextInt();

        System.out.println("Enter speed : ");
        this.speed =sc.nextInt();
    }

    public void gearChange(){
        System.out.println("The gear Number is : "+ gear);
    }

    public void speedUp() {
       System.out.println("The speed of Car is : "+ speed);
    }

    public void applyBreaks() {
        if(breaks == 1){
            System.out.println("Breaks Applied");
        }else{
            System.out.println("Still Running");
        }
    }
}


class Car implements Vehicle{
    int gear;
    int breaks;
    int speed;


    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gear number : ");
        this.gear =sc.nextInt();

        System.out.println("Enter 1 if breaks are applied else enter 0: ");
        this.breaks =sc.nextInt();

        System.out.println("Enter speed : ");
        this.speed =sc.nextInt();
    }
    public void gearChange(){
        System.out.println("The gear Number is : "+ gear);
    }

    public void speedUp() {
        System.out.println("The speed of Car is : "+ speed);
    }

    public void applyBreaks() {
        if(breaks == 1){
            System.out.println("Breaks Applied");
        }else{
            System.out.println("Still Running");
        }
    }
}


class Bicycle implements Vehicle{
    int gear;
    int breaks;
    int speed;


    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gear number : ");
        this.gear =sc.nextInt();

        System.out.println("Enter 1 if breaks are applied else enter 0: ");
        this.breaks =sc.nextInt();

        System.out.println("Enter speed : ");
        this.speed =sc.nextInt();
    }
    public void gearChange(){
        System.out.println("The gear Number is : "+gear);
    }

    public void speedUp() {
        System.out.println("The speed of Bicycle is : "+ speed);
    }

    public void applyBreaks(){
        if(breaks == 1){
            System.out.println("Breaks Applied");
        }else{
            System.out.println("Still Running");
        }
    }
}

public class assignment5{
    public static void main(String args[]){
        System.out.println("Bike : ");
        Bike b = new Bike();
        b.getData();
        b.gearChange();
        b.speedUp();
        b.applyBreaks();
        System.out.println();

        System.out.println("Bicycle : ");
        Bicycle b1 = new Bicycle();
        b1.getData();
        b1.gearChange();
        b1.speedUp();
        b1.applyBreaks();
        System.out.println();

        System.out.println("Car : ");
        Car c = new Car();
        c.getData();
        c.gearChange();
        c.speedUp();
        c.applyBreaks();
        System.out.println();

    }
}
