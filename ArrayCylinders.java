import java.util.Scanner;

public class ArrayCylinders {

    public static void main ( String [] args ){
       Scanner in = new Scanner(System.in);
       final int NUM_CYLINDERS = 5;
       Cylinder[] list = new Cylinder[NUM_CYLINDERS] ;
       double radius;
       double height;

       //1) fill the information for each Cylinder from the user

        for (int i = 0; i < NUM_CYLINDERS; i++){
            System.out.println("Enter height for cylinder: " + (i+1));
            height = in.nextDouble();
            System.out.println("Enter radius for cylinder: " + (i+1));
            radius = in.nextDouble();
            list[i] = new Cylinder(radius, height);
        }


        // 2)print the information of all Cylinders
        for (int i = 0; i < NUM_CYLINDERS; i++){
            list[i].print();
        }


    }
 }

