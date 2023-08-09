import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //VARIABLES
        String f = "Fizz";
        String b = "Buzz";
        int fizz = 5;
        int buzz = 3;

        //capture input
        Scanner scanner = new Scanner(System.in);

        //capture number
        System.out.println("Enter the Number: ");
        byte number = scanner.nextByte();
        System.out.println("The number is " + number);

        //decision logic
        if ((number % fizz == 0 )&&( number % buzz == 0)){
            System.out.println(f + b);
        } else if (number % buzz == 0) {
            System.out.println(b);
        } else if (number % fizz == 0) {
            System.out.println(f);
        }else {
            System.out.println(number + " is divisible by neither 3 nor 5.");
        }



    }
}