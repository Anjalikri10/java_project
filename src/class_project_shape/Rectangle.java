package class_project_shape;

public class Rectangle extends TwoDShape{
  double l;
  double w;
	Rectangle(){
		
	}
	Rectangle(double l ,double w){
		this.l=l;
		this.w=w;
	}
	
	
	@Override
	public void getArea() {
		System.out.println("The area of Reactangle is : "+l*w+"sq.unit");
		
		
	}

	@Override
	public void getPerimeter() {
		System.out.println("The perimeter of Rectangle is : "+2*(l*w)+"unit");
		
		
	}

}
