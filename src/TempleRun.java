
/**
 *
 * @author shuhaib
 */
import java.util.Scanner;

public class TempleRun {

	/**
	 * @param args
	 *            the command line arguments
	 */

	static Competitor[] compList = new Competitor[4];

	public static void main(String[] args) {

		enterDetails();
		displayWinners();
		Menu();

	}

	private static void enterDetails() {

		Scanner sc = new Scanner(System.in);

		System.out.println("---------------------Welcome to Temple Run------------------");
		System.out.println("Enter your records");

		for (int i = 0; i < 4; i++) {

			System.out.print("\n" + " competitor number : ");
			int compNum = sc.nextInt();
			System.out.print(" competitor Name : ");
			String name = sc.next();
			System.out.print(" competitor Age : ");
			int age = sc.nextInt();
			int coins = 0;
			do{
			if(coins<0){
				System.out.println("Invalid number, try agains");
			}
			System.out.print(" Number of coins collected : ");
			coins = sc.nextInt();
			}while(coins<0);
			System.out.print(" Score achieved : ");
			int score = sc.nextInt();
			System.out.print(" Distance reached :  ");
			int distance = sc.nextInt();

			Competitor obj = new Competitor();
			obj.setCompetitorNumber(compNum);
			obj.setName(name);
			obj.setAge(age);
			obj.setCoins(coins);
			obj.setScore(score);
			obj.setDistance(distance);
			obj.IntializeMaxCoins();
			obj.IntializeMaxDistance();
			obj.IntializeMaxScore();

			compList[i] = obj;

		}

	}

	private static void displayWinners() {

		System.out.println("--------------Winners As Follows--------------");

		for (Competitor obj : compList) {

			if (obj.getScore() == Competitor.getMaxScore()) {
				System.out.println(" The competitor with the highest score.");
				System.out.print(" ID :" + obj.getCompetitorNumber());
				System.out.print(" | Name: " + obj.getName());
				System.out.print(" | Age: " + obj.getAge());
				System.out.print(" | coins collected: " + obj.getCoins());
				System.out.print(" | Score: " + obj.getScore());
				System.out.println(" | Distance reached " + obj.getDistance());
				System.out.println("--------------------------------------------");
				// System.out.println(obj);
			}

			if (obj.getCoins() == Competitor.getMaxCoins()) {
				System.out.println(" The competitor who collected the maximum number of gold coins.");
				System.out.print(" ID :" + obj.getCompetitorNumber());
				System.out.print(" | Name: " + obj.getName());
				System.out.print(" | Age: " + obj.getAge());
				System.out.print(" | coins collected: " + obj.getCoins());
				System.out.print(" | Score: " + obj.getScore());
				System.out.println(" | Distance reached " + obj.getDistance());
				System.out.println("--------------------------------------------");
			}

			if (obj.getDistance() == Competitor.getMaxDistance()) {
				System.out.println(" The competitor who ran the maximum distance.");
				System.out.print(" ID :" + obj.getCompetitorNumber());
				System.out.print(" | Name: " + obj.getName());
				System.out.print(" | Age: " + obj.getAge());
				System.out.print(" | coins collected: " + obj.getCoins());
				System.out.print(" | Score: " + obj.getScore());
				System.out.println(" | Distance reached " + obj.getDistance());
				System.out.println("--------------------------------------------");
			}
		}

	}

	private static void Menu() {

		Scanner input = new Scanner(System.in);

		boolean stop = false;

		do {

			System.out.println("\nEnter 'V' to view all competitor details.");
			System.out.println("Enter 'S' to view a selected player’s details given the competitor number");
			System.out.println("Enter 'T' to view all three winners");
			System.out.println("Enter 'W' to view a selected winner ");
			System.out.println("Enter 'N' to exit.");

			char enteredChoice = input.next().charAt(0);

			if (enteredChoice == 'V' || enteredChoice == 'v') {
				ViewAll();
			} else if (enteredChoice == 'S' || enteredChoice == 's') {
				selectedPlayer();
			} else if (enteredChoice == 'T' || enteredChoice == 't') {
				ViewThreeWinners();
			} else if (enteredChoice == 'W' || enteredChoice == 'w') {
				selectedWinner();
			} else if (enteredChoice == 'N' || enteredChoice == 'n') {
				stop = true;
			} else {
				System.out.println("Invalid Input , please check the instructions above");
			}
		} while (stop != true);

	}

	private static void ViewAll() {
		System.out.println("\nAll Competitors\n");
		for (Competitor obj : compList) {
			System.out.print(" ID :" + obj.getCompetitorNumber());
			System.out.print(" | Name: " + obj.getName());
			System.out.print(" | Age: " + obj.getAge());
			System.out.print(" | coins collected: " + obj.getCoins());
			System.out.print(" | Score: " + obj.getScore());
			System.out.println(" | Distance reached " + obj.getDistance());
			System.out.println("--------------------------------------------");
		}
	}

	private static void selectedPlayer() {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("\nEnter Competitor Number : ");
		int num = sc1.nextInt();
		for (Competitor obj : compList) {
			if (obj.getCompetitorNumber() == num) {
				System.out.println(obj);
			}

		}
	}

	private static void ViewThreeWinners() {
		displayWinners();
	}

	private static void selectedWinner() {

		Scanner sc2 = new Scanner(System.in);

		System.out.println("\nEnter Selected Catogery \n");
		System.out.println("Enter '1' The competitor with the highest score.");
		System.out.println("Enter '2' The competitor who collected the maximum number of gold coins.");
		System.out.println("Enter '3' The competitor who ran the maximum distance. ");

		int enteredChoice = sc2.nextInt();

		if (enteredChoice == 1) {

			for (Competitor obj : compList) {
				if (obj.getScore() == Competitor.getMaxScore()) {
					System.out.println(" The competitor with the highest score.");
					System.out.println(obj);
				}
			}
		} else if (enteredChoice == 2) {

			for (Competitor obj : compList) {
				if (obj.getCoins() == Competitor.getMaxCoins()) {
					System.out.println(" The competitor who collected the maximum number of gold coins.");
					System.out.println(obj);
				}
			}
		} else if (enteredChoice == 3) {

			for (Competitor obj : compList) {
				if (obj.getDistance() == Competitor.getMaxDistance()) {
					System.out.println(" The competitor who ran the maximum distance.");
					System.out.println(obj);
				}
			}
		} else {
			System.out.println("Invalid Input , please check the instructions above");
		}

	}

}
