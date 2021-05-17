// SundaeShop 
// Name:Prabhash G C Date Assigned: 3rd May 2021

// Course: 2000-60356 Date Due: 8th May 2021

// Instructio: Ms.Greer
// File name: SundaeShop.java


/*Program Description: This is the driver program for our Sundae class.
                       Here the information about the store is displayed.
                       The program allows the user to input about the details 
                       of their Sundae. It uses the methods defined over the
                       Sundae class; Then if finally displays the reciept of the 
                       menu.*/
                      
                      



// Start of Program
// To import the Scanner class from  the utility package
import java.util.Scanner;


public class SundaeShop
{

   public static void main(String[] args)
   {
   
   
   // Creation of Scanner object in our main class
   Scanner in = new Scanner(System.in);
   
   
   // Creation of Sundae object 
   Sundae item = new Sundae();
   
   //Declaring our only constant for the program
   final double PRICEPERSCOOP = 0.99;
   
   
   // To display the intial info about store
      
   System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-" + 
                      "=-=-=-=-=-=-=-=-=-=-=-=-= \n\n "+
                      "        BUILD THE PERFECT SUNDAE FOR YOU!\n\n"+
                      "=-=-=-=-=-=-=-=-=-=-=-=-" + 
                      "=-=-=-=-=-=-=-=-=-=-=-=-= \n\n ";);
   
   
   /* Taking input from user, ie about the flavor, 
      toppings and number of scoops*/
      
      
   System.out.print("Enter the ice cream flavor: ");
   String flavor = in.nextLine();
   
   System.out.print("\nEnter topping 1: ");
   String topping1 = in.nextLine();
   
   
   System.out.print("Enter topping 2: ");
   String topping2 = in.nextLine();
   
   
   System.out.print("Enter topping 3: ");
   String topping3 = in.nextLine();
   
   
   System.out.print("\nEnter number of Scoops: ");
   int numberOfScoops = in.nextInt();
   
   
   
   /* Using our setters to store the inputs from user in our 
      instance variables*/
      
      
   item.setFlavor(flavor);  // setFlavor() method to store flavor input
   
   item.setTopping(topping1);       // setTopping() method to store the topping1
   String list1 = item.AddTopping(""); 
                                   // use of AddTopping() to add the topping to the list  
   
   
   item.setTopping(topping2);       // setTopping() method to store the topping2
   String list2 = item.AddTopping(list1);
                                    // use of AddTopping() to add the topping to the list
 
  
   item.setTopping(topping3);       // setTopping() method to store the topping3
   String toppingList = item.AddTopping(list2);
                                    // use of AddTopping() to add the topping to the list 
    
   
   item.setTopping(toppingList);    // using the setTopping() to set the value of list
   
   
  
   item.setNumberOfScoop(numberOfScoops); /* using the setTopping() to set the value
                                             of numeberofScoops*/
   
   
   
   System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-" + 
                    "=-=-=-=-=-=-=-=-=-=-=-=-= \n\n");

   System.out.println(item.toString());  /* using  toString() method to display 
                                            our output*/
   
   System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-" + 
                    "=-=-=-=-=-=-=-=-=-=-=-=-= \n\n");


   System.out.println("====================="+ "\n|" +
                      "      RECIEPT      |" + "\n" +
                      "=====================");  
   item.Recipt(PRICEPERSCOOP);                /* using the Reciept() method
                                                 argumeent is priceperscoop
                                                 and return value is none*/
   System.out.println("=====================");
  

   
   
   }
}

//End of Program