import java.util.Scanner;

public class loop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");


        int score = input.nextInt();
        if (score <= 80 && score >0){
            System.out.println("You failed the exam");
        }
        else if (score >=80 && score >0 ) {
            System.out.println("You passed the exam");
        }
        else {
            System.out.println("You entered an invalid number");
        }
    }
}
