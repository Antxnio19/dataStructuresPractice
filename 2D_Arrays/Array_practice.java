import java.util.Random;
import java.security.Principal;
import java.util.*;


class Array_practice {
    
    /* 
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    */

    //COUNTING THE OCCURRENCES OF EACH LETTER
    /* 
    public static char[] createArray(){
        char[] chars = new char[100];

        for(int i = 0; i < chars.length; i++){
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }

    public static void displayArray(char[] chars){
        for(int i = 0; i < chars.length; i++){
            if((i+1) % 20 == 0){
                System.out.println(chars[i]);
            }
            else
            System.out.print(chars[i] + " ");
        }
    }

    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];

        for(int i = 0; i < chars.length; i++){
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts){
        for(int i = 0; i < counts.length; i++){
            if ((i+1) % 10 == 0){
                System.out.println(counts[i] + " " + (char) (1 + 'a'));
            }
            else
            System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }
   */

   //VARIABLE-LENGTH ARGUMENT
    /* 
   public static void printMax(double... numbers){
    if(numbers.length == 0){
        System.out.println("no arguments passed");
        return;
    }
    double result = numbers[0];

    for(int i = 1; i < numbers.length; i++){
        if(numbers[i] > result){
            result = numbers[i];
        }
    }
    System.out.println("The max value is " + result);

   }
   */

   //LINEAR SEARCH
   /* 
   public static int linearSearch(int[] list, int key){
    for(int i = 0; i < list.length; i++){
        if(key == list[i]){
            return 1;
        }
    }
    return -1;
   }
    */

    //BINARY SEARCH
   /* 
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        
        while(high >= low){
            int mid = (low + high) / 2;
            if(key < list[mid]){
                high = mid - 1;
            }else if (key == list[mid]){
                return mid;
            }else 
            low = mid + 1;
        }
        return -low - 1;
    }
  
*/

    //SELECTION SORT
    /* 
    public static void selectionSort(double[] list){
        for(int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    */
    public static void main(String[] args){
   /* double[] myList = new double[4];
    myList[0] = 1.9;
    myList[1] = 2.9;
    myList[2] = 3.4;
    myList[3] = 3.5;

    for(int i = 0; i < myList.length; i++){
        System.out.println(myList[i]);
    }
    System.out.print(myList.length); 

    double[] myList = new double[10];

    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter " + myList.length + " valuse: ");
    for(int i = 0; i < myList.length;i++){
        myList[i] = input.nextDouble();
    } */

    /* double[] myList = new double[10];
    for(int i = 0; i < myList.length; i++){
        myList[i] = Math.random() * 100;
    }
    //total loop
    double total = 0;
    for(int i = 0; i < myList.length; i++){
        total = myList[i] + total;
    }
    
    System.out.print(total); */

    // Max value
    /* 
    int[] myList = new int[5];
    for(int i = 0; i < myList.length; i++){
        myList[i] = (int) (Math.random() * 50);
    }
    int max = myList[0];
    int indexOfMax = 0;
    for(int i = 1; i < myList.length; i++){
        if(max < myList[i]){
            max = myList[i];
            indexOfMax = i;
        }
       
    }
    for(int i = 0; i < myList.length; i++){
        System.out.println(myList[i]);
    }

    System.out.println("This is the max value in the array: " + max);
    System.out.println("This is the index of the max value in the array: " + indexOfMax);
    }
    */

    //random shuffling 
    /* 
    double[] myList = new double[5];
    for(int i = 0; i < myList.length; i++){
        myList[i] =  Math.random() * 10;
    }

    System.out.println("populated array: ");

    for(int i = 0; i < myList.length; i++){
        System.out.println(myList[i]);
    }

    System.out.println("shifted array: ");

    for(int i = 0; i < myList.length -1; i++){
        int j = (int) (Math.random() * myList.length);

        double temp = myList[i];
        myList[i] = myList[j];
        myList[j] = temp;
    }

    for(int i = 0; i < myList.length; i++){
        System.out.println(myList[i]);
    } */

    //shifting elements left
    /* 

    int[] myList = {1, 2, 3, 4, 5};
    
    int temp = myList[0];
    for(int i = 1; i < myList.length; i++){
        myList[i - 1] = myList[i];
    }
    myList[myList.length -1] = temp;

    for(int i = 0; i < myList.length; i++){
        System.out.println(myList[i]);}
        */

    //month array
    /* 
    String[] months = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
    System.out.println("Enter a month number (1 to 12): ");
    java.util.Scanner input = new java.util.Scanner(System.in);
    int monthNumber = input.nextInt();

    System.out.println("the month is: " + months[monthNumber - 1]);
    // how to print elements in array 
    for(String e: months){
        System.out.println(e);
    }
    */

    /*Analyzing mumbers
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Enter the number of items: ");
    int n = input.nextInt();
    double[] number = new double[n];
    double sum = 0;

    System.out.print("Enter the numbers: ");
    for(int i = 0; i < n; i++){
        number[i] = input.nextDouble();
        sum += number[i];
    }

    double average = sum/n;

    int count = 0;
    for (int i = 0; i < n ; i++){
        if(number[i] > average){
            count++;
        }
    }

    System.out.println("average is: " + average);
    System.out.println("Number of elements above the average is: " + count);
 */

    //Deck of cards****
    /* 
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    //initialize the cards
    for(int i = 0; i < deck.length; i++){
        deck[i] = i;
    }

    //shuffle the cards
    for(int i = 0; i < deck.length; i++){
        //generate the index randomly
        int index = (int) (Math.random() * deck.length);
        int temp = deck[i];
        deck[i] = deck[index];
        deck[index] = temp;
    }

    //Display the first four cards
    for(int i = 0; i < 4; i++){
        String suit = suits[deck[i] / 13];
        String rank = ranks[deck[i] % 13];
        System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
    }
    */

    //COPYING ARRAY TO ANOTHER ARRAY
    /* 
    int[] source = {3,4,5};
    int[] t = new int[source.length];
    System.arraycopy(source, 0, t, 0, source.length);
    for(int e: t){
        System.out.println(e);
    } */

    //PASSING ARRAYS TO METHODS
    /* 
    printArray(new int[] {1,2,3,4,5,6});
    int[] myArray = {1,3,5,7,8};
    printArray(myArray);
    */

    //COUNTING THE OCCURRENCES OF EACH LETTER
    /* 
    char[] chars = createArray();

    System.out.println("The lowercase letters are: ");
    displayArray(chars);

    int[] counts = countLetters(chars);

    System.out.println();
    System.out.println("The occurrences of each letter are " );
    displayCounts(counts);
    */

    //VARIABLE LENGTH ARGUMENT LISTS
    /* 
    printMax(34, 3, 3, 2, 56,5);
    printMax(new double[] {1, 2, 3});
    */

    //LINEAR SEARCH
    /* 
    int[] list = {1,4,4,2,5,-3,6,2};
    int i = linearSearch(list, 4);
    int j = linearSearch(list, -4);
    int k = linearSearch(list, -3);

    System.out.println("i: " + i + " j:" + j + " k: " + k );
    */

    //BINARY SEARCH
    /* 
    int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
    int i = binarySearch(list, 2);
    int j = binarySearch(list, 11);
    int k = binarySearch(list, 12);
    int l = binarySearch(list, 1);
    int m = binarySearch(list, 3);

    

    System.out.println("i: " + i + " j: " + j + " k: " + k + " l: " + l + " m: " + m );
    */

    //SELECTION SORT
    /* 
    double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    java.util.Arrays.sort(list);
//selectionSort(list);
System.out.println("Sorted Array: ");

// Use the correct format specifier
for (double e : list) {
    System.out.printf("%.1f ", e); // Correctly formatted output
}
*/

//THE ARRAY CLASS
/* 
int[] list1 = {2,4,7,10};
int[] list2 = {2,4,7,7,7,10};
java.util.Arrays.fill(list1,5);
java.util.Arrays.fill(list2, 1,5,8);
System.out.print(java.util.Arrays.toString(list1));
for(int e: list1){
    System.out.print(e + " ");
}
System.out.println();
for(int p: list2){
    System.out.print(p + " ");
}
*/

//COMMAND LINE ARGUMENTS



}
}