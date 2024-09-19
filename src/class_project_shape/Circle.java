package class_project_shape;

public class Circle extends TwoDShape {
  double r;
  Circle(){
	  
  }
  Circle(double r){
	  this.r=r;
  }
  
	@Override
	public void getArea() {
		double area =3.14*r*r;
		System.out.println("The area of circle is : "+area+"sq.unit");
		
	}

	@Override
	public void getPerimeter() {
		System.out.println("perimeter of circle is: "+2*3.14*r+"Unit");
		
	}

	
	

}
