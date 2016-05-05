import java.util.Scanner;

public class Dice2Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the number of dices to play with: ");
		int diceNum = Dice2.Throw(input.nextInt());
		
		System.out.println("Dice number is "+ diceNum);
		
		System.out.print("Enter the number of bounces: ");
		int bounces = input.nextInt();
		
		System.out.println(Dice2.Throw(diceNum, bounces));
		
		ThreeDice threeDice = new ThreeDice();
		
		System.out.println(threeDice.Throw());
	}

}
