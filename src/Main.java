import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double userLength, userWidth, userHeight, area, perimeter, volume = 0;

        /*double userWidth = 0;
        double userHeight = 0;
        double area = 0;
        double perimeter = 0;
        double volume = 0;*/


        //sout
        System.out.print("Enter length of classroom: ");
        userLength = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter width of classroom: ");
        userWidth = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter height of classroom: ");
        userHeight = scan.nextDouble();
        scan.nextLine();

        area = (userLength * userWidth);
        perimeter = ((userLength * 2) + (userWidth * 2));
        volume = (userLength * userWidth * userHeight);

        System.out.println("The area of the class room is: " + area + " sq ft.");
        System.out.println("The perimeter of the class room is: " + perimeter + " ft.");
        System.out.println("The volume of the class room is: " + volume + " cu ft.");
/*

       do {

           System.out.println("Continue? (y/n) ");
           userAnswer=scan.nextBoolean();

           if(userAnswer == "y") {

           }

           else if (userAnswer == "n") {

           END PROGRAM

           }

*/


    }
}
