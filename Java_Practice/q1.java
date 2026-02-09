import java.util.Scanner;;

public class q1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter 3rd number: ");
        int c = scanner.nextInt();

        float avg = (a+b+c)/3;

        System.out.println(avg);;
        

    }
}
