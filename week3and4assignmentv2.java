import java.util.Arrays;


public class week3and4assignmentv2 {

  public static void main(String[] args) {
    
    //1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    
    //1.a returned 90 (93-3) b.
    int[] ages = {3,9,23,64,2,8,28,93,150,203};
    
    
    int lengthOfArray = ages.length;
    int difference = Math.abs(ages[0] - ages[lengthOfArray - 1]);
    System.out.println(difference);
    // now that i added 150 and 203 it printed 147 and 200 because (3-last number of array)
    
    //1.c c.    Use a loop to iterate through the array and calculate the average age. 
    //Print the result to the console
    int sum = 0;
    for (int i = 0; i < ages.length; i++) {
         sum += ages[i];
    } 
    double average = sum / lengthOfArray;
    System.out.println(average);
    
    
    //2. 2. Create an array of String called names that contains 
    //the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    sum = 0;
    for (int i = 0; i < names.length; i++) {
            sum += names[i].length();
    }
    average = sum / names.length;
    System.out.println(average);
    // 2.b useing a loop to print out all names with space. 
    String allNames = "";
    for (int i = 0; i < names.length; i++) {
          allNames += names[i] + " ";
     }
    System.out.println(allNames);
    
    
    // 3. How do you access the last element of any array?
      System.out.println("array[array.length]");
    
    // 4. How do you access the first element of any array?
      System.out.print("array[0]");
    
    //5.  Create a new array of int called nameLengths. Write a loop to iterate over 
    //the previously created names array and add the length of each name to the nameLengths array.
    
    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
          nameLengths[i] = names[i].length();
    }
    
    //6.    Write a loop to iterate over the nameLengths array and calculate the sum of all 
    //the elements in the array. Print the result to the console.
    
    sum = 0;
    for (int i = 0; i< nameLengths.length; i++) {
          sum += nameLengths[i];
    }
    System.out.println(sum);
    
    //7.    Write a method that takes a String, word, and an int, n, as arguments and returns the word 
    //concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
    //I expect the method to return “HelloHelloHello”).
    System.out.println(repeatedWord("Hello", 3));
   
 
    //8.    Write a method that takes two Strings, firstName and lastName, and returns a full name 
    //(the full name should be the first and the last name as a String separated by a space).
    
    System.out.println(fullName("Kory", "Erickson"));
    
    //9.    Write a method that takes an array of int and 
    //returns true if the sum of all the ints in the array is greater than 100.
    System.out.println(checkIfSumGreaterThan100(ages));
    
    //10.   Write a method that takes an array of double and returns the average of all the elements in the array
    
    double[] doubleArr = {0.6, 5.3, 420.69, 9001, 777.6969};
    double[] emptyDoubleArr = {};
    System.out.println(getAverageOfDoubleArr(doubleArr));
    System.out.println(getAverageOfDoubleArr(emptyDoubleArr));
    
    //11.   Write a method that takes two arrays of double and returns true if the average of the elements 
    //in the first array is greater than the average of the elements in the second array.
    
    double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
    System.out.println(isFirstArrAvgGreater(doubleArr, anotherDoubleArr));
    
    
    //12.   Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
    //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
    boolean isHotOutside = true;
    double moneyInPocket = 20.69;
    System.out.println(willBuyDrink(isHotOutside, moneyInPocket)); 
    
    //13.
    int temp = 110;
     System.out.println(pantsOrShorts(temp));
     
    
    
  }
 
  private static String repeatedWord(String word, int x) {
    String repeatedWord = "";
    for (int i = 0; i < x; i++) {
            repeatedWord += word;
    }
    return  repeatedWord;
    
  }
  
  private static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
    
  }
  
  private static Boolean checkIfSumGreaterThan100(int[] arr) {
    return Arrays.stream(arr).sum() > 100;
  }
  
  private static double getAverageOfDoubleArr(double[] arr) {
    return Arrays.stream(arr).average().orElse(Double.NaN);
  } 
  
  private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
    return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr); 
  }
  
  public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
    if (isHotOutside && moneyInPocket > 10.50) { 
        return true;
    }else {
        return false;
    }
    
  }
    
    private static String pantsOrShorts (int temp){
      if (temp > 90) {
          return "shorts"; 
      }else {
          return "pants";
  }
      
      
      
}
  
  
  
}    
