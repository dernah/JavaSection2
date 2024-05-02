import java.util.Scanner;

public class Proj2_1_AverageOfThree {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double numOne, numTwo, numThree, mean;

        System.out.print("Enter your first number: ");
        numOne = keyboard.nextFloat();

        System.out.print("Enter your second number: ");
        numTwo = keyboard.nextFloat();

        System.out.print("Enter your third number: ");
        numThree = keyboard.nextFloat();

        keyboard.nextLine(); // good habit

        mean = (numOne + numTwo + numThree) / 3;

        System.out.print("The average of the three numbers is: " + mean);

        //test
    }
}
