import java.util.Scanner;

public class simple{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         // 1 - delare variable 
        int a;
        int b;
        int addition;
        int subtraction;
        int multiply;
        float devide;
        int remainder;

         // 2 - request user input
         System.out.print("Enter number 1 : ");
        a = input.nextInt();
        System.out.print("Enter number 2 : ");
        b = input.nextInt();
         
        // 3 - add value in variable
        addition = a + b;
        subtraction = a - b;
        multiply = a * b;
        devide = (float) a / b;
        remainder = a % b;

       
        // 4 - print output
        System.out.printf("Your addition number is %d\n", addition);
        System.out.printf("Your subtraction number is %d\n", subtraction);
        System.out.printf("Your multiply number is %d\n", multiply);
        System.out.printf("Your devide number is %.1f\n", (float)devide);
        System.out.printf("Your remainder number is %d\n", remainder);

        


        
    }
}