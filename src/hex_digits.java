import java.util.Scanner;

public class hex_digits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit");
        String hexString = input.nextLine();

        if (hexString.length() != 1) {
            System.out.println("Your must enter exactly one character");
            System.exit(1);
        }
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        }
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        }
        else {
            System.out.println(ch + "Is an invalid input");

        }


        }


    }

