import java.util.*;
public class Factorial {
    public static void main(String[]args){
        int num1;
        int sum = 1; 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        for (int index = 1; index <= num1; index ++)
        {
            sum *= index;
        }
        input.close();
        System.out.println("Result: " + sum);
    }
}