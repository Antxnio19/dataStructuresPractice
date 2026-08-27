import java.util.Scanner;
class practice {

    public static void main(String[] args){
        /**double radius = 1;
        System.out.println(radius > 0); **/

        //=========================================

        //3.2.3 cannot be done
        /** 
        boolean b = true;
        i = (int)b;

        int i = 1;
        boolean b = (boolean)i; */

        //=========================================
        /**3.3.1
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int y = input.nextInt();
        int x = 0;

        if(y > 0){
            x = 1;
        }
        System.out.println("The value of x is: " + x + " and the value of y is: " + y);
        **/

        //==========================================

        /** 3.3.2 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score value between 0 - 100: ");
        int score = input.nextInt();
        System.out.println("Enter your pay: ");
        double pay = input.nextInt();

        if(score > 90){
            double bonus = pay * .03;
            pay = pay + bonus;
        }

        System.out.println("Your Pay is: " + pay);
        */
        //=========================================

        /** 3.4.1 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score value between 0 - 100: ");
        int score = input.nextInt();
        System.out.println("Enter your pay: ");
        double pay = input.nextInt();
        double bonus = 0;

        if(score > 90){
            bonus = pay * .03;
            pay = pay + bonus;
        }
        else{
            bonus = pay * .01;
            pay = pay + bonus;
        }

        System.out.println("Your Pay is: " + pay);
        */
        //===========================================

        
    }
}