package se.lexicon.leo;

import java.util.Scanner;


public class App 
{
    public static void main(String[] args) {
//1

    /* Car car = new Car( "Volvo", "335 kW","v60","2021","White" );
    car.drive();

     */


//2
    Rectangle rs = new Rectangle();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length : ");
    double a = sc.nextDouble();
    rs.setHeight(a);
    System.out.println("enter the width : ");
    double b = sc.nextDouble();
    rs.setWidth(b);

    System.out.println("Area of rectangle is : " + rs.getArea());
    sc.close();


    }

//3






}
