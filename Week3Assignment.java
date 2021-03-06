
public class Week3Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1.	Create an array of int called ages that contains the following values:
//			3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93,};
		
		System.out.println("**Question 1.a**");
		
//		a.	Programmatically subtract the value of the first element in the array from the value
//		in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		
		for (int i = 1; i < ages.length - 1; i++) {	
		System.out.println(ages[i]);
		}
			System.out.println("**Question 1.b**");
			
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic
//		(works for arrays of different lengths).
		
		int[] agesPlus = {3, 9, 23, 64, 2, 8, 28, 93, 31};
		for (int o = 1; o < agesPlus.length - 1; o++) {	
		System.out.println(agesPlus[o]);
		}
		System.out.println("**Question 1.c**");
		
//		c.	Use a loop to iterate through the array and calculate the average age.
//		Print the result to the console.
		
		   double seanConnery = 0;
		    for ( int u = 0; u < ages.length; u++) {
		        seanConnery += ages[u];
		    }
		    double danielCraig = seanConnery / ages.length;
		    System.out.println("Int array average: " + danielCraig);
		

//		    2.	Create an array of String called names that contains the following values:
//		    	?Sam?, ?Tommy?, ?Tim?, ?Sally?, ?Buck?, ?Bob?.
		
		String[] names = new String[6];
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";
			names[4] = "Buck";
			names[5] = "Bob";
		
				System.out.println("**Question 2.a**");
				
//				a.	Use a loop to iterate through the array and calculate the average number
//				of letters per name. Print the result to the console.
			
			   double rogerMoore = 0;
		    for ( int a = 0; a < names.length; a++) {
		        rogerMoore += names[a].length();
		    }
		    double pierceBrosnan = rogerMoore / names.length;
		    System.out.println("String array average: " + pierceBrosnan);
		    System.out.println("**Question 2.b**");
		    
//		    b.	Use a loop to iterate through the array again and concatenate all the names together,
//		    separated by spaces, and print the result to the console.
		    
		    StringBuilder bobThe = new StringBuilder();
		    for ( int e = 0; e < names.length; e++) {
		       bobThe.append(names[e]);
		    }
		       String yarn = bobThe.toString();
		       System.out.println(yarn);
//		3.	How do you access the last element of any array? 
		       
		System.out.println("**Question 3**");
		
		System.out.println("names[names.length - 1] is accessing the last array index: " + names[names.length - 1]);
			
		System.out.println("**Question 4**");
		
//		4.	How do you access the first element of any array?
			
		System.out.println("names[0] is accessing the first index: " + names[0]);
		
		System.out.println("**Question 5**");
		
//		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously
//		created names array and add the length of each name to the nameLengths array.
		
		int[] namesLength = {3, 5, 3, 5, 4, 3};
		
		int length = 0;
		for (String twine : names) {
			length = twine.length();
			System.out.println(twine + " " + length);
			}
		
		System.out.println("**Question 6**");
		
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the
//		elements in the array. Print the result to the console.
		
		int sum = 0;
		for(int addedNL : namesLength) {
			sum += names.length;
			}
			System.out.println(sum);
		
		System.out.println("**Question 7**");
		
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word
//		concatenated to itself n number of times. (i.e. if I pass in ?Hello? and 3, I would
//				expect the method to return ?HelloHelloHello?).
		
		System.out.println(multiplyString("Hello", 3));
		
		System.out.println("**Question 8**");
		
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
//		(the full name should be the first and the last name as a String separated by a space).
		
		System.out.println(fullName("Ricky", "Bobby"));
		
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints 
//		in the array is greater than 100.
			
		System.out.println("**Question 9**");
		
		int[] myInts = {17, 31, 13, 7, 33};
		System.out.println(intArray(myInts));
		
//		10.	Write a method that takes an array of double and returns the average of all the elements
//		in the array.
		
		System.out.println("**Question 10**");
		
		double[] grades = new double[5];
		
		grades[0] = 88.7;
		grades[1] = 68.2;
		grades[2] = 92.5;
		grades[3] = 74.4;
		grades[4] = 82.9;
		
		System.out.println(doubleArray(grades));
		
//		11.	Write a method that takes two arrays of double and returns true if the average of the
//		elements in the first array is greater than the average of theelements in the second array.
		
		System.out.println("**Question 11**");
		
		double[] hamburger = {23.45, 12.87, 32.69, 1.98};
		double[] cheeseburger = {87.12, 15.04, 53.90, 2.98};
		System.out.println(doubleTimesTwo(hamburger, cheeseburger));
	
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
//		and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		System.out.println("**Question 12**");
		
		boolean isHotOutside = false;
		double moneyInPocket = 40.01;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
//		13.	Create a method of your own that solves a problem. In comments, write what the method
//		does and why you created it.
		
		System.out.println("**Question 13**");
		
		System.out.println(power(345, 2));
		
//		math was never my strongest suit so a method that would assist me with math problems
//		would always be helpful for me
		
	  } 
//		**Question 7**
		public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
			}
		return result;
		}
		
		
//		**Question 8**
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		}
	
	
//		**Question 9**
		public static boolean intArray(int[] numbers) {
			int sum = 0;
		for (int x : numbers) {
			sum += x;
 			if ( sum > 100) {
 				return true;
			} 
			 
		   }
		return false;
	    }
		
		
//	    **Question 10**
		public static double doubleArray(double[] numbers) {
			double sum = 0;
			for (double number : numbers) {
				sum += number;
		 }
		return sum / numbers.length;
		}
		
		
//		**Question 11**
		public static boolean doubleTimesTwo(double[] dubOne, double[] dubTwo) {
			double sumOne = 0;
			double sumTwo = 0;
			for (double x : dubOne) {
				sumOne += x;
			for (double y : dubTwo) {
				sumTwo += y;
				if (sumOne < sumTwo) {
					
				}
			 }
		  }
				return true;
		}
	
		
//		**Question 12**
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside && moneyInPocket >= 10.50 == true) {	
				return true;
			} else {
				
			}
			return false;
		}
	
		
//		**Question 13**
		public static int power(int base, int exponent) {
			 int result = 1;
			    while (exponent != 0) {
			      result *= base;
			      --exponent;
			    }
				return result;
			
		}
	}

