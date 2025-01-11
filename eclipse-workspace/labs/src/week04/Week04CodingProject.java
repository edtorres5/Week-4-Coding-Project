package week04;

import java.util.Arrays; // Needed for printing arrays in Step 5

public class Week04CodingProject {

    public static void main(String[] args) {

        // Step 1: Create an array of int called ages
        // The 'ages' array stores a list of integer values to perform calculations on.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // 1a. Subtract first element from last element
        // This calculates the difference between the last and first elements of the array dynamically.
        int result1a = ages[ages.length - 1] - ages[0];
        System.out.println("Step 1a: " + result1a);

        // 1b. Create a new array of int called ages2
        // The 'ages2' array has additional elements compared to 'ages' to show dynamic indexing.
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 45};

        // 1b.i and 1b.ii: Subtract first element from last element dynamically
        // This dynamically calculates the difference for an array of any length.
        int result1b = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Step 1b: " + result1b);

        // 1c. Calculate the average age
        // Calculates the average value of the elements in the 'ages' array.
        double averageAge = 0;
        // Iterate through each element in the ages array and accumulate the sum of the values.
        for (int age : ages) {
            averageAge += age;
        }
        // Divide the accumulated sum by the total number of elements in the array to get the average.
        averageAge /= ages.length;
        System.out.println("Avg age: " + averageAge);

        // Step 2: Create an array of Strings called names
        // The 'names' array contains a list of names for processing.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // 2a. Calculate the average number of letters per name
        // Iterates through the names and computes the average length of the names.
        double averageLetters = 0;
        // Iterate through each name in the names array and accumulate the total number of letters.
        for (String name : names) {
            averageLetters += name.length();
        }
        // Divide the total number of letters by the number of names to get the average.
        averageLetters /= names.length;
        System.out.println("Average number of letters per name: " + averageLetters);

        // 2b. Concatenate all names together separated by spaces
        // Joins all the names in the 'names' array into a single string with spaces.
        String concatenatedNames = "";
        // Append each name to the concatenatedNames string, adding a space after each name.
        for (String name : names) {
            concatenatedNames += name + " ";
        }
        // Remove the extra space at the end of the string.
        concatenatedNames = concatenatedNames.trim();
        System.out.println("Concatenated names: " + concatenatedNames);

        // Step 3: Access the last element of any array
        // Prints the last element of the 'names' array.
        System.out.println("Last element of names array: " + names[names.length - 1]);

        // Step 4: Access the first element of any array
        // Prints the first element of the 'names' array.
        System.out.println("First element of names array: " + names[0]);

        // Step 5: Create a new array of int called nameLengths
        // Creates an array of name lengths by measuring each name's length in the 'names' array.
        int[] nameLengths = new int[names.length];
        // Populate the nameLengths array by storing the length of each name.
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        System.out.println("nameLengths array: " + Arrays.toString(nameLengths));

        // Step 6: Calculate the sum of all elements in nameLengths
        // Calculates the total of all name lengths in the 'nameLengths' array.
        int sumNameLengths = 0;
        // Iterate through each element in the nameLengths array and accumulate the sum of the lengths.
        for (int length : nameLengths) {
            sumNameLengths += length;
        }
        System.out.println("Sum of all elements in nameLengths array: " + sumNameLengths);

        // Step 7: Method to repeat a word n times
        // Example demonstrating the repeatWord method.
        System.out.println("Repeat word example: " + repeatWord("Hello", 3));

        // Step 8: Method to return full name
        // Example demonstrating the fullName method.
        System.out.println("Full name example: " + fullName("John", "Doe"));

        // Step 9: Method to check if the sum of an array is greater than 100
        // Example demonstrating the isSumGreaterThan100 method.
        System.out.println("Is sum greater than 100: " + isSumGreaterThan100(new int[]{10, 20, 30, 40, 5}));

        // Step 10: Method to calculate the average of an array of doubles
        // Example demonstrating the averageOfArray method.
        System.out.println("Average of array: " + averageOfArray(new double[]{1.0, 2.0, 3.0, 4.0, 5.0}));

        // Step 11: Method to compare averages of two arrays
        // Example demonstrating the isFirstAverageGreater method.
        System.out.println("Is first average greater: " + isFirstAverageGreater(new double[]{1.0, 2.0, 3.0}, new double[]{4.0, 5.0, 6.0}));

        // Step 12: Method willBuyDrink
        // Example demonstrating the willBuyDrink method.
        System.out.println("Will buy drink: " + willBuyDrink(true, 11.0));

        // Step 13: Custom Method
        // Example demonstrating the isPalindrome method.
        System.out.println("Is 'Racecar' a palindrome: " + isPalindrome("Racecar"));
    }

    //7.  Method to repeat a word n times
    // This method takes a string and an integer as input and returns the string repeated n times.
    public static String repeatWord(String word, int n) {
        StringBuilder repeatedWord = new StringBuilder();
        // Loop n times to append the word to the StringBuilder.
        for (int i = 0; i < n; i++) {
            repeatedWord.append(word);
        }
        return repeatedWord.toString();
    }

    // 8. Method to return full name
    // This method combines a first name and a last name into a single full name string.
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9. Method to check if the sum of an array is greater than 100
    // This method takes an array of integers as input and returns true if the sum of its elements exceeds 100.
    public static boolean isSumGreaterThan100(int[] arr) {
        int sum = 0;
        // Iterate through the array and ;accumulate the sum of all elements.
        for (int num : arr) {
            sum += num;
        }
        // Check if the sum exceeds 100.
        return sum > 100;
    }

    // 10. Method to calculate the average of an array of doubles
    // This method takes an array of doubles as input and returns the average of its elements.
    public static double averageOfArray(double[] arr) {
        double sum = 0;
        // Iterate through the array and accumulate the sum of all elements.
        for (double num : arr) {
            sum += num;
        }
        // Divide the sum by the array's length to find the average.
        return sum / arr.length;
    }

    // 11. Method to compare averages of two arrays
    // This method compares the averages of two arrays of doubles and returns true if the first average is greater.
    public static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
        // Compare the average of the first array to the average of the second array.
        return averageOfArray(arr1) > averageOfArray(arr2);
    }

    // 12. Method willBuyDrink
    // This method determines whether to buy a drink based on the weather and the amount of money in pocket.
    // Returns true if it is hot outside and moneyInPocket is greater than 10.50.
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        // Check both conditions (hot weather and sufficient money) to determine if a drink will be bought.
        return isHotOutside && moneyInPocket > 10.50;
    }

    // 13. Custom Method: Check if a string is a palindrome
    // A palindrome is a word, phrase, or sequence that reads the same backward as forward (ignoring spaces and capitalization).
    // This method takes a string, removes spaces, converts it to lowercase, and checks if it is equal to its reverse.
    public static boolean isPalindrome(String s) {
        // Remove spaces and convert the string to lowercase.
        s = s.replace(" ", "").toLowerCase();
        // Compare the string to its reverse.
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
