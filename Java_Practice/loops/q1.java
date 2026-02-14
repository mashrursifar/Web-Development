package loops;

import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        long fact = 1;

        for(int i=1; i<=x; i++)
        {
            fact = i*fact;
        }

        System.out.println("Factorial of "+x+": "+fact);
        sc.close();
    }
}
