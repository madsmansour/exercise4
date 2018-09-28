import java.util.Scanner;

public class Addtionquiz {


        public static void main(String[] args) {
            int number1 = (int)(Math.random() * 100);
            int number2 = (int)(Math.random() * 100);

            // Create a Scanner
            Scanner input = new Scanner(System.in);

            System.out.print(
                    "What is " + number1 + " + " + number2 + "? ");
            int answer = input.nextInt();

//lavet et loop hvis svaret er forkert
            while (number1 + number2 != answer) {
                System.out.print("Wrong answer. Try again. What is "
                        + number1 + " + " + number2 + "? ");
                answer = input.nextInt();
            }

            System.out.println("You got it!");
        }
    }

