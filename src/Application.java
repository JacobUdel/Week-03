import java.util.Scanner;

public class Application {
	
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;

	public static void main(String[] args) {
		// Arrays
		String studentName1 = "Tom Sayer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		String[] students = new String[3];
		
		students[0] = "Tom Sayer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("Enhanced for loop");
		for (String student : students) {
			System.out.println(student);
		}
		
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineappless";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			System.out.println("Product: " + product);
		}
		
		int[] multiplesOf3 = new int[10];
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i - 1] = i * 3;
			System.out.println("number: " + multiplesOf3[i - 1]);
		}
		
		int[] multiplesOf5 = new int[10];
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = i * 5;
			System.out.println(multiplesOf5[i]);
		}
		
		// Methods
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println();
		System.out.println(fullName);
		System.out.println(fullName2);
		System.out.println();
		
		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
		
		System.out.println(sumArray(myArray));
		
		//String[] strings = new String[1];
		
		double[] grades = new double[5];
		grades[0] = 88.7;
		grades[1] = 92.5;
		grades[2] = 100;
		grades[3] = 67.3;
		grades[4] = 78.9;
		
		System.out.println();
		System.out.println(calculateAverage(grades));
		System.out.println();
		
		
		
		System.out.println(multiplyString("Hello",3));
		System.out.println();
		
		//Methods
		
		String name = "Sally Mae";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		
		
		
		int[] numbers = new int[3];
		System.out.println(numbers.length);
		System.out.println();
		
		//Equality
		
		String a = new String("Hello");
		String b = new String("Hello");
		System.out.println("String a: " + a);
		System.out.println("String b: " + b);
		System.out.println(a == b); //This is coming out true if Strings are setup w/o new e.g. String a = "Hello";
		System.out.println(a.equals(b));
		System.out.println();
		
		// Menu app example
		String[] team = new String[5];
		
		int decision = 0;
		while (decision != -1) {
			showMenu();
			
			decision = s.nextInt();
			if (decision < -1 || decision > 5) {
				System.out.println("Invalid Option");
			} else if (decision == 1) {
				showTeam(team);
			} else if (decision == 2) {
				showTeamMember(team);
			} else if (decision == 3) {
				addTeamMember(team);
			} else if (decision == 4) { 
				deleteMember(team);
			} else if (decision == 5) {
				deleteAllTeamMembers(team);
			}
			
		} 
	}
	
	public static boolean isValid(int input) {
		if (input >= 0 && input < 5) {
			return true;
		} else {
			System.out.println("Invalid entry");
			return false;
		}
	}
	private static void deleteAllTeamMembers(String[] team) {
		for (int i = 0; i < team.length; i++) {
			team[i] = null;
		}
		
	}
	private static void deleteMember(String[] team) {
		System.out.println("Which team member would you like to delete?");
		int memberToDelete = s.nextInt();
		if (isValid(memberToDelete)) {
			team[memberToDelete] = null;
		}
		
	}
	private static void addTeamMember(String[] team) {
		System.out.print("Enter new member namer.");
		String newMember = s.next();
		if (isValid(addingIndex)) {
			team[addingIndex++] = newMember;
		}
		
	}
	private static void showTeamMember(String[] team) {
		System.out.println("Which team member would you like to see (1 - 5)?");
		int teamNumber = s.nextInt();
		if (isValid(teamNumber)) {
		System.out.println(teamNumber + ": " + team[teamNumber]);
		} 
		
	}
	private static void showTeam(String[] team) {
		System.out.println("Team");
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + ": " + team[i]);
		}
		
	}
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}
	
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum/numbers.length;
	}
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	public static void showMenu() {
		System.out.println("Please pick an option or -1 to exit");
		System.out.println("1) Show Team");
		System.out.println("2) Show Team Member");
		System.out.println("3) Add Team Member");
		System.out.println("4) Delete Team Member");
		System.out.println("5) Delete ALL Team Members");
		
	}
}
