package class_project_shape;

public class square extends TwoDShape {
       double a;
       square(){
    	   
       }
       square(double a){
    	   this.a=a;
       }
	@Override
	public void getArea() {
		System.out.println("The area of Square is : "+a*a+"sq.unit");
		
		
	}
	@Override
	public void getPerimeter() {
		System.out.println("The perimeter of Square is : "+4*a+"unit");
		
		
	}
}
