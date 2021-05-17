class Triangle
{
   private double base;
   private double height;
   private double area;
      
   public void setBase (double b)
   {
      base = b;
   }
   
   public void setHeight (double h)
   {
      height = h;
   }
  
  public double getBase()
   
   {
      return base;
  
   }
   
  public double getHeight ()
   
   {
      return height;
  
   }
   
  public double getArea()
   
   {
	  double area = 0.5 * base * height;
      return area;
  
   }
  

 
   
      

}