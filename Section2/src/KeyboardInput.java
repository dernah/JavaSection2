import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        double realNumber;
        int age;

        System.out.println("What is your name? ");
        name = keyboard.nextLine();

        System.out.println("What's your age?");
        age = keyboard.nextInt();
        keyboard.nextLine(); // Consume the new line when taking a non-string

        System.out.println("What is the real number?");
        realNumber = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Real number doubled is: " + realNumber * 2);

        System.out.println("What city do you live in?");
        city = keyboard.nextLine();


        System.out.println("Hello, " + name);
        System.out.println("Age is " + age);
        System.out.println("City is " + city);

    }//end main
}
