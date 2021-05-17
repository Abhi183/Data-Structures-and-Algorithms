
//Declaration of our Class Sundae
public class Sundae
{
  
  
  // Declaration of our instance variables
   private String flavor;
   private int numberOfScoop;
   private String topping;
  
   
   // NO argument constructor 
   public Sundae()
   {
      String flavor = "Vanilla";
      int numberOfScoop = 3;
      String topping = "Marshmellow";
     
   }

   
   
   // Argument Constructor
   
   public Sundae(String f, int n, String t1)
   {
   
      flavor = f;
      numberOfScoop = n;
      topping = t1;
      
    
   }
     
     
   
   // Creation of our mutators, using setters
   
   public void setFlavor(String _f)
   {
      flavor = _f;
      
   }
   
   public void setNumberOfScoop(int _n)
   {
      numberOfScoop = _n;
      
   }
   
   public void setTopping(String t1)
   {
      topping = t1;
      
   }
   
  
   
   
   
   //Creation of our accessors, using getters
   
   public String getFlavor()
   {
      return flavor;
      
   }
   
   
   public int getNumberOfScoop()
   {
      
      return numberOfScoop;
      
   }
   
  
   public String getTopping()
   {
      return topping;
      
   }
    
   // Creating AddTopping method that adds topping to a list and 
   public String AddTopping(String x)
   {
   
   String toppingList = "-" + getTopping() + "\n";
   toppingList = x + toppingList;
   
   return toppingList;
   }     
   
   
   
   // Use of toString method to display the output at once
   public String toString()
   {
      
      
      String display = "Sundae with " + getNumberOfScoop() +
                       " scoop(s) of " + getFlavor() +
                       " ice cream.\n\n" + getTopping();
     
      
      
      return display; 
   } 
    

  
   
  
  
  
  
  /*Reciept() method where argument is priceperscoop
    and return value is none*/
  
  public void Recipt(double p)
  {
  
  
  double subTotal = p*getNumberOfScoop();
  double tax = subTotal*0.11;
  double total = tax + subTotal;
  System.out.printf("| SubTotal%10.2f|\n| Tax     %10.2f|\n| Total   %10.2f|\n",
                     subTotal, tax, total);
  }
  



}