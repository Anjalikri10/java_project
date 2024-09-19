package class_project_shape;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
		char c;
		do {
			int choice = g.selectShape();
			switch(choice)
			{
			case 1:
				System.out.println("You have selected 2D shape");
				TwoDShape twod =g.selectTwoDShape();
				twod.getArea();
				twod.getPerimeter();
			break;
			
			case 2:
				System.out.println("You have selected 2D shape");
				ThreeDShape threed =g.selectThreeDShape();
				threed.getVolume();
				threed.getLateralSurfaceArea();
				threed.getTotalSurfaceArea();
				
			break;
			}
			System.out.println("Enter Y/y to Restart the game....");
			c = sc.next().charAt(0);
		}while(c=='Y'||c=='y');
		System.out.println("====Thankyou! Game Ends!====");

	}

}
