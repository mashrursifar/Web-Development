package loops;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get it's table: ");

        int x = sc.nextInt();

        for(int i =1;i<11; i++)
        {
            System.out.println(i+"*"+x+" = "+i*x);
        }



        sc.close();
    }
}
