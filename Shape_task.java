package task_3;

public class Shape_task {

	public static void main(String[] args) 
	{
		Shape myshape;
		 myshape= new Circle(5);
		 System.out.println("Area of circle: "+myshape.calculateArea());
		 
		 myshape =new Triangle(4,6);
		 System.out.println("Area of Triangle: "+myshape.calculateArea());
        
		  myshape =new Rectangle(3,7);
		  System.out.println("Area of Rectangle : "+myshape.calculateArea());
				  
	}

}

abstract class Shape
{
	abstract double calculateArea();
}

 class Circle extends Shape
 {
     private double radius;
     Circle(double radius)
     {
    	 this.radius=radius;
     }
	 
	@Override
	double calculateArea() {
		
		return Math.PI*radius*radius;
	}
	 
 }
 
  class Rectangle extends Shape
  {
     private double Length;
     private double Width;
     Rectangle(double Length,double Width)
     {
    	 this.Length=Length;
    	 this.Width=Width;
    	 
     }
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return Length*Width;
	}
	  
  }
  class Triangle extends Shape
  {
	  private double base;
	  private double heigth;
	  
	  Triangle(double base,double heigth)
	  {
		  this.base=base;
		  this.heigth=heigth;
	  }

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5*base*heigth;
	}
	  
  }
