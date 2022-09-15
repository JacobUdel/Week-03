
public class Application {

	public static void main(String[] args) {
		//1a
		System.out.print("1a) ");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length - 1] - ages[0]);
		//1b
		System.out.print("1b) ");
		int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 93, 103};
		System.out.println(ages1[ages1.length - 1] - ages1[0]);
		//1c
		System.out.print("1c) ");
		double sumOfAges = 0;
		for (int age : ages) {
			sumOfAges += age;
		}
		System.out.println(sumOfAges / ages.length);
		//2a
		System.out.print("2a) ");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters / names.length);
		//2b
		System.out.print("2b) ");
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		//3
		System.out.println("3) The last element of an array is indexed at [length - 1]");
		//4
		System.out.println("4) The first element of an array is indexed at [0]");
		//5
		System.out.print("5) ");
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();			
		}
		for (int len : nameLengths) {
			System.out.print(len + " ");
		}
		System.out.println();
		//6
		System.out.print("6) ");
		int sumOfLengths = 0;
		for (int len : nameLengths) {
			sumOfLengths += len;
		}
		System.out.println(sumOfLengths);
		//7
		System.out.print("7) ");
		System.out.println(repeatNTimes("Hello",3) + " " + repeatNTimes("Bye", 4));
		//8
		System.out.print("8) ");
		System.out.println(fullName("Jake", "Udel"));
		//9
		System.out.print("9) ");
		System.out.println(sumOfIntsGreater100(ages));
		//10
		System.out.print("10) ");
		double[] dArray = {1.23, 4.56, 7.89};
		System.out.println("The average is: " + getAverage(dArray));
		//11
		System.out.print("11) ");
		double[] dArray2 = {1.0, 2.0, 3.0};
		System.out.println(firstAveGreater(dArray, dArray2));
		//12
		System.out.print("12) ");
		boolean isHotOutside = true;
		double moneyInPocket = 10.53;
		if (willBuyDrink(isHotOutside, moneyInPocket)) {
			System.out.println("Will buy drink");
		} else {
			System.out.println("Won't buy drink");
		}
		//13
		System.out.print("13) ");
		//Count the number of words in a string
		System.out.println(countWords("Testing one two three"));
		
	}
	public static int countWords(String string) {
		//This method takes a string and uses the space character to count words
		//This method could be a helper method for parsing sentences
		int count = 0;
		for (int i = 0; i< string.length(); i++) {
			if (string.charAt(i) == ' ') {
				count++;
			}
		}
		count++; //last word is not followed by a space and must be counted
		return count;
	}
	
	public static boolean willBuyDrink(boolean hot, double cash) {
		return hot && (cash > 10.50);
	}

	public static boolean firstAveGreater(double[] dArray, double[] dArray2) {
		return getAverage(dArray) > getAverage(dArray2);
	}

	public static double getAverage(double[] dArray) {
		double sum = 0;
		for (double num : dArray) {
			sum += num;
		}
		return sum / dArray.length;
	}

	public static boolean sumOfIntsGreater100(int[] numbers) {
		int sumOfInts = 0;
		for (int num : numbers) {
			sumOfInts += num;
		}
		return sumOfInts > 100;
	}

	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public static String repeatNTimes(String word, int n) {
		String result = word;
		for (int i = 1; i < n; i++ ) {
			result += word;
		}
		return result;
	}
	

}
