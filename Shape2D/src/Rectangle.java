
public class Rectangle extends Shape_2D {
	
	public Rectangle() {}
	public Rectangle(double dim1, double dim2) {super(dim1,dim2);}
	//public double computeArea() { return dim1*dim2;}
	//public double computePerimeter() { return 2*(dim1+dim2);}
	public String toString() {
		return "The rectangle has two sides " + Double.toString(dim1)+ " , and "+
		Double.toString(dim2)+ ". Its area is " + Double.toString(computeArea())+
		". Its perimeter is " + Double.toString(computePerimeter());
				
	}
	@Override
	public double computeArea() {return dim1*dim2;	}
	@Override
	public double computePerimeter() {return 2*(dim1+dim2);	}
	

}
