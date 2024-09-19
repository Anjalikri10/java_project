package class_project_shape;

public class Cylinder extends ThreeDShape {
	double r;
	double h;
	Cylinder(){
		
	}
	Cylinder(double r,double h){
		this.r=r;
		this.h=h;
	}

	@Override
	public void getVolume() {
		System.out.println("Cylinder volume is: "+3.14*r*r*h+" sq.unit");
		
	}

	@Override
	public void getLateralSurfaceArea() {
		System.out.println("Cylinder LateralSurfaceArea is: "+2*3.14*r*h+" sq.unit");
		
	}

	@Override
	public void getTotalSurfaceArea() {
		System.out.println("Cylinder TotalSurfaceArea is: "+2*3.14*r*(h+r)+" sq.unit");
		
		
	}

}
