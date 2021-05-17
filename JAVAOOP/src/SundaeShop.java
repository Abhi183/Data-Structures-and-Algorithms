import java.util.Scanner;

public class SundaeShop
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      Sundae sundae = new Sundae();
      
      System.out.println("=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
      System.out.println("              BUILD THE PERFECT SUNDAY FOR YOU!");
      System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
      
      System.out.println("");
      
      System.out.print("Enter ice cream flavor: ");
      String flavor = input.nextLine();
     
      
      System.out.println("");
      
      System.out.print("Enter topping 1: ");
      String topping1 = input.nextLine();
      
      
      System.out.print("Enter topping 2: ");
      String topping2 = input.nextLine();
      
      
      System.out.print("Enter topping 3: ");
      String topping3 = input.nextLine();
      
      
      System.out.println("");   
      
      System.out.print("Enter number of scoops of strawberry ice cream: ");
      int numberOfScoops = input.nextInt();
      
      
      System.out.println("=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
      
      sundae.setFlavor(flavor);
      sundae.setToppings(topping1);
      String a = sundae.add_topping(" ");
      sundae.setToppings(topping2);
      String b = sundae.add_topping(a);
      
      sundae.setToppings(topping3);
      String c = sundae.add_topping(b);
      sundae.setToppings(c);
      sundae.setNumberOfScoops(numberOfScoops);
      sundae.toString();
      
      
      
      
      
      
      System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-" + 
              "=-=-=-=-=-=-=-=-=-=-=-=-= \n\n");

      System.out.println(sundae.toString());   
                                      

      System.out.print("\n=-=-=-=-=-=-=-=-=-=-=-=-" + 
              "=-=-=-=-=-=-=-=-=-=-=-=-= \n\n");


     System.out.println("====================="+ "\n|" +
                        "      RECIEPT      |" + "\n" +
                          "=====================");  
     sundae.Recipt();               
     System.out.println("=====================");

      
   
   }
}