import java.util.Scanner;
public class SubtractionQuizLoop {
    public static void main(String[] args){
        int count = 0;
        int correct = 0;
        String output = " ";
        long startTime = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);

        while(count < 5){
            int num1 = (int)(Math.random() * 11);
            int num2 = (int)(Math.random() * 11);

            if(num1 < num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            System.out.println("What is " + num1 + " - " + num2);
            int guess = input.nextInt();
            int answer = num1 - num2;
           
            
            if(guess == answer){
                System.out.println("You are correct!");
                correct++;
                
            }
            else {
                System.out.println("Your answer is wrong. \n" + num1 + " - " + num2 + " should be " + answer);
               
            }
            count++;
            output += "\n" + num1 + " - " + num2 + " = " + guess + ((num1 - num2 == guess) ? " correct": " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("\nCorrect count is " + correct + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}