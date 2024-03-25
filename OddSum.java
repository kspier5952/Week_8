import java.util.*;
public class OddSum {
    public static void main(String[]args){
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        input.close();
        for (int index = 1; index <= number; index+= 2)
        {
            sum += index;
        }
        System.out.println("Result: " + sum);
    }
}
