package logic.programs;
import java.util.Scanner;

public class ReverseNumber {
        //method for reverse a number
        public static void ReverseNumber(int number)
        {
            if (number < 10)
            {
//prints the same number if the number is less than 10
                System.out.println(number);
                return;
            }
            else
            {
                System.out.print(number % 10);
                ReverseNumber(number/10);
            }
        }
        public static void main(String args[])
        {
            System.out.print("Enter the number that you want to reverse: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.print("The reverse of the given number is: ");
//method calling
            ReverseNumber(num);
        }
    }

