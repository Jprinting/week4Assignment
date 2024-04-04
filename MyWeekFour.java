package promineotech.com;

public class MyWeekFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        // my array of ages
        int subtractionResult = ages[ages.length - 1] - ages[0];
        // ages.length - 1 accesses the last value in the array, and 0 accesses the first, as Java starts counting at 0.
        System.out.println("The first int minus the last. " + subtractionResult);
        //the printed result.

        
        int[] ages2 = {4, 10, 24, 65, 3, 9, 29, 94, 100};
        // my array for ages2
        int subtractionResultAges2 = ages2[ages2.length - 1] - ages2[0];
        // the written the same way, but ages has 8 elements, and ages2 has 9 elements yet they both worked as intended.
        System.out.println("The first int minus the last. " + subtractionResultAges2);

        
        double sum = 0;
        //sum of 0
        for (int age : ages) {
            sum += age;
            // a loop to add up all the ages into the single number.
        }
        double average = sum / ages.length;
        // sum is now equal the age and that number becomes divided by the length of the array (ages) giving us our average.
        System.out.println(" The average of the first array " + average);
        
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        // a string array
        int totalLetters = 0;

        for (String name : names) {
            totalLetters += name.length();
            // loop for calculate all the letters in names
        }

        double averageLetters = (double) totalLetters / names.length;
        // the total letters divided by the length of the name array
        System.out.println(" The average of the amount of letters of all the word" + averageLetters);

        
        StringBuilder concatenatedNames = new StringBuilder();
        
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
            // loop allowing a space between all the name is in the array to be printed
        }

      
        System.out.println("The Concatenated names: " + concatenatedNames);

        
        String lastElement = names[names.length - 1];
        //  the last element of any array
        System.out.println("Last element: " + lastElement);

        
        String firstElement = names[0];
        // the first element of any array
        
        System.out.println("First element: " + firstElement);
        System.out.println(repeatWord("Hello", 3));
        System.out.println(fullName("John", "Doe"));
        System.out.println(isSumGreaterThan100(new int[]{50, 51}));
        System.out.println(average(new double[]{10.5, 20.5, 30.5}));
        System.out.println(isFirstArrayAverageGreater(new double[]{10, 20, 30}, new double[]{5, 10, 15}));
        System.out.println(willBuyDrink(true, 11.00));
        // the print statements call for all the following methods that are outside of the main method
        
        boolean isFinalQuestion = true;
        boolean finalQuestionCheck = isFinalQuestion(isFinalQuestion);
        System.out.println("Is this the final question? " + finalQuestionCheck);
        // my final method
        
        
       }
	public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
            //a loop that the string and adds the words together in a string builder equal to the int 
        }
        return result.toString();
        //the return method to return the changed result when it goes back to the sysout
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
        //method that takes the strings, adds a space and returns it to the sysout
    }

    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
            // a method loop that adds about the sum of two numbers and chekcs if they are greater than 100
        }
        return sum > 100;
        // the return of the sum to check
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
            // a method and its loop that checks the average of the array
        }
        return sum / array.length;
        // the return which divides the amount of elements in the array byt the sum 
    }

    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
        return average(array1) > average(array2);
        // a method of a boolean to check if array 1 is greater than array 2
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
        // a boolean that will return true if its both hot outside and you have moneyInPocket greater than 11.5
     
    }

   
    public static boolean isFinalQuestion(boolean isFinal) {
        return isFinal;
        // I couldn't think of another method to do and why so I went with a boolean that was accurate.
    }
}
		
