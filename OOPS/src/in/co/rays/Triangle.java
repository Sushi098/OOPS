package in.co.rays;

public class Triangle extends Shape {
	
	private int base =0;
	private int height =0;
	
	public Triangle() {
		 
	}	
	    public Triangle(int base, int height) 
	    {
	    	this.base = base;
	    	this.height = height;
	    }

	public int getBase() 
	{
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int height) {
		this.height = height;	
}
	
	public void area() {
		double area = (base * height) / 2;
		System.out.println("Triangle area = " + area);
	}
}