package move;
import java.util.Random;
import java.util.Scanner;
public class move {
static Random rn=new Random();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Starting game now");
		generator gn=new generator();
		System.out.println("Creating destination coordinates");
		System.out.println("-----------------------------------------");
		int dest_x=rn.nextInt(9)+1;
		int dest_y=rn.nextInt(9)+1;
		System.out.println("Destination x : "+dest_x+" Destination y : "+dest_y);
		gn.setvalues(dest_x, dest_y,1);
		gn.getvalues();
		System.out.println("-----------------------------------------");
		System.out.println("Creating Player");
		System.out.println("-----------------------------------------");
		int player_x=rn.nextInt(9)+1;
		int player_y=rn.nextInt(9)+1;
		if(dest_x==player_x&&dest_y==player_y)
		{
			while(dest_x==player_x&&dest_y==player_y)
			{
				player_x=rn.nextInt(9)+1;
				player_y=rn.nextInt(9)+1;
			}
		}
		System.out.println("Player x : "+player_x+" Player y : "+player_y);
		gn.setvalues(player_x, player_y,5);
		gn.getvalues();
		System.out.println("-----------------------------------------");
		boolean flag=false;
		while(!flag)
		{
			System.out.println("Creating number of moves: ");
			int moves=rn.nextInt(4)+1;
			System.out.println("Number of moves allowed this time : "+moves);
			System.out.println("Enter the direction to move: 1.Up  2.Down  3.Left  4.Right");
			int choice=sc.nextInt();
			switch (choice)
			{
			case 1:
				int player_current_x=gn.getplayer_x();
				int player_current_y=gn.getplayer_y();
				System.out.println("Current position of player is X : "+player_current_x+" Y : "+player_current_y);
				int newvalue_x=player_current_x-moves;
				if(newvalue_x<1)
				{
					newvalue_x=1;
				}
				System.out.println("Now moving the player to position of X : "+newvalue_x+" Y :"+player_current_y);
				gn.setvalues(player_current_x, player_current_y, 0);
				gn.setvalues(newvalue_x, player_current_y, 5);
				gn.getvalues();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
			flag=true;
		}
	}

}
