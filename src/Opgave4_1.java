import java.util.Scanner;

public class Opgave4_1 {

    public static void main(String[] args) {

        double area;

        Scanner scan = new Scanner(System.in);

        System.out.println("input lenght from center to a vertex: ");
        double r = scan.nextDouble();

        double s = 2*r*Math.sin((Math.PI)/(5));

        area = (5*Math.pow(s,2))/(4*(Math.tan((Math.PI)/(5))));

        System.out.println("The area of the pentagon is: " + area);

        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);

        }



    }

}