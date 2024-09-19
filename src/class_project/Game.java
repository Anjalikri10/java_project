package class_project;
import java.util.*;

public class Game {

			
	public  Weapon   pressWeaponButton() 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your score");
	int score =sc.nextInt();
			if(score<=400) {
			System.out.println("You got the knife");
			Knife k = new Knife();
			return k;
			        }else if(score<=800) {
			System.out.println("You got the Gun");
			Gun g = new Gun();
			return g;
			                       }else {
				System.out.println("You got the Bomb");
				Bomb b = new Bomb();
				return b;
			}
		}

	}


