/**
 * This program demonstrates the Triangle class's
 * setBase, setHeight, getBase, getHeight, and 
 * getArea methods. 
 */

/** DO NOT CHANGE THIS FILE!!! **/

import java.util.Scanner;

public class TriangleDrive
{
   public static void main(String[] args)
   {
      // Declare/initialize object variables
      Scanner scan = new Scanner(System.in);
      Triangle triangle = new Triangle();
      
      
      // Ask user to enter base of circle
      System.out.print("Enter the base of the triangle: ");
      double base = scan.nextDouble();
      
      System.out.print("Enter the height of the triangle: ");
      double height = scan.nextDouble();
      
      
      //set height and base of triangle
      triangle.setBase(base);
      triangle.setHeight(height);
      
      
      // Display the base, height, and area.
      System.out.println("\nThe triangle's base is " + triangle.getBase());
      System.out.println("The triangle's height is " + triangle.getHeight());
      System.out.printf("The triangle's area is %.2f\n", triangle.getArea());
   }
}