public class Sundae
{
   private String flavor;
   private int numberOfScoops;
   private String toppings;
   public Sundae() {
	   String flavor = "";
	   int numberOfScoops =  0;
	   String toppings = "";
	     
	   
   }
   public Sundae(String flavor, int numberOfScoops, String toppings) {
	   this.flavor=flavor;
	   this.numberOfScoops = numberOfScoops;
	   this.toppings =toppings;
   }
   
   public void setFlavor (String f) 
   {
      flavor = f;
   }
   
   public void setNumberOfScoops (int n)
   {
      numberOfScoops = n;
   }
   
   public void setToppings (String t)
   {
      toppings = t;
   }

  
   public String getFlavor()
   
   {
      return flavor;
  
   }
   
  public int getNumberOfScoops ()
   
   {
      return numberOfScoops;
  
   }
   
  public String getToppings()
   
   {
            
      return toppings;
      
   }
  
  public String toString() {
	return "Sundae with " + getNumberOfScoops() +
            " scoop(s) of " + getFlavor() +
            " ice cream.\n\n" + getToppings();
	  
  }
  public String add_topping(String topping){
	   String a = "-" + getToppings() + "\n";
	   a = topping + a;
	   
	   
	return a;
	  
  }
  public void Recipt()
  {
  
  
  double subTotal = 0.99 *getNumberOfScoops();
  double tax = subTotal*0.11;
  double total = tax + subTotal;
  System.out.printf("SubTotal: " + subTotal + "\n" + "Tax"  + tax + "\n" + "Total:" + total);
                     
  }
  

}