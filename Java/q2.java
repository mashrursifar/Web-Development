import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for getting squre:  ");

        int a = scanner.nextInt();

        System.out.println(a*a);
        scanner.close();
    }
    
}
