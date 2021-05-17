
public class RightTriangle extends Shape_2D {
	private double dim3;
	public RightTriangle() {}
	public RightTriangle(double dim1, double dim2) {
		super(dim1,dim2);
		dim3= Math.sqrt(dim1*dim1 + dim2*dim2);
	}
	public RightTriangle(double dim1, double dim2, double dim3) {
		super(dim1,dim2);
		if(Math.abs(dim3- Math.sqrt(dim1*dim1 + dim2*dim2)) < 0.00000001)
				this.dim3=dim3;
	}
	public double dim3() { return dim3;}
	public void setdim1(double dim1) {
		this.dim1= dim1;
		dim3= Math.sqrt(dim1*dim1 + dim2*dim2);}
	public void setdim2(double dim2) {
		this.dim2= dim2;
		dim3= Math.sqrt(dim1*dim1 + dim2*dim2);}
	@Override
	public double computeArea() {return dim1*dim2/2;}
	@Override
	public double computePerimeter() { return (dim1+dim2+dim3);}
	@Override
	public String toString() {
		return "The triangle has three sides " + Double.toString(dim1)+ ", "+
		Double.toString(dim2)+ ",and "+ Double.toString(dim3)+". Its area is "
		+ Double.toString(computeArea())+
		". Its perimeter is " + Double.toString(computePerimeter());
				
	}

}
