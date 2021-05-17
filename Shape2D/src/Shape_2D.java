
public abstract class Shape_2D {
	protected double dim1, dim2;
	public Shape_2D() {}
	public Shape_2D(double dim1,double dim2 ) {
		this.dim1= dim1;
		this.dim2=dim2;
	}
	public double dim1() { return dim1;}
	public double dim2() { return dim2;}
	public void setdim1(double dim1) { this.dim1= dim1;}
	public void setdim2(double dim2) { this.dim2= dim2;}
	public abstract double computeArea();
	public abstract double computePerimeter();
	public String toString() {
		return "The 2D shape has the following sides: "
	    + Double.toString(dim1)  + ", and " +Double.toString(dim2); 
	}
	

}
