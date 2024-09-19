package class_project_shape;
import java.util.Scanner;

public class Game {
      Game(){
    	  System.out.println("Welcome To Game");
      }
      public int selectShape() {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Press 1 for ===>2D shape");
    	  System.out.println("Press 2 for ===>3D shape");
    	  
    	  int option = sc.nextInt();
    	  if(option ==1 || option ==2) {
    		  return option;
    	  } else {
    		  System.out.println("Invalid option");
    	  }
    	  return selectShape();
      }
      
      public TwoDShape selectTwoDShape() {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Press 1 for circle");
    	  System.out.println("Press 2 for Rectangle");
    	  System.out.println("Press 3 for Square");
    	  
    	  int choice =sc.nextInt();
    	  switch(choice)
    	  {
    	  case 1:
    		  System.out.println("You have selected circle");
    		  System.out.println("Enter the Radius");
    		  double radius = sc.nextDouble();
    		  Circle c1 = new Circle(radius);
    		  return c1;
    		  
    	  case 2:
    		  System.out.println("You have selected Rectangle");
    		  System.out.println("Enter the Length");
    		  double l = sc.nextDouble();
    		  System.out.println("Enter the width");
    		  double w = sc.nextDouble();
    		  
    		  return new Rectangle(l,w);
    		  
    	  case 3:
    		  System.out.println("You have selected Square");
    		  System.out.println("Enter the Side");
    		  double a = sc.nextDouble();
    		  
    		  return new square(a);
    		  
    		  default:
    			  System.out.println("Invalid choice!");
    			  return selectTwoDShape();
    	  }
      }
	public ThreeDShape selectThreeDShape() {
		Scanner sc = new Scanner(System.in);
  	  System.out.println("Press 1 for cylinder");
  	  System.out.println("Press 2 for sphere");
  	  System.out.println("Press 3 for Hemisphere");
   	  System.out.println("Press 4 for cone");
  	  
  	  int choice =sc.nextInt();
  	  switch(choice)
  	  {
  	  case 1:
  		  System.out.println("You have selected cylinder");
  		  System.out.println("Enter the Radius");
  		  double radius = sc.nextDouble();
  		System.out.println("Enter the height");
		  double height = sc.nextDouble();
  		  
  		  return new Cylinder(radius,height);
  		   default:
  			   System.out.println("Invalid choice!");
  			   
  			   return selectThreeDShape();
  			   
	}
}
}
