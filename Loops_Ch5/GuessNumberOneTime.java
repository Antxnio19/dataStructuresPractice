import java.util.Scanner;
public class GuessNumberOneTime {
    public static void main(String[] args){
        int answer = (int)(Math.random() * 101);
        
        System.out.println("Guess a magic number between 0 and 100");
        int guess = -1;
        while(guess != answer){
            System.out.println("Enter your guess: ");
            Scanner input = new Scanner(System.in);
            guess = input.nextInt();

            if (guess == answer){
                System.out.println("Yes, the number is " + answer);
            }
            else if (guess < answer){
                System.out.println("Your guess too low");
            }
            else {
                System.out.println("Your guess is too high");
            }
        }
    }
}