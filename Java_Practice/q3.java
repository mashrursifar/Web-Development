import java.util.Scanner;;

public class q3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of a pencil: ");
        float a = scanner.nextFloat();

        System.out.print("Enter the price of a pen: ");
        float b = scanner.nextFloat();
        
        System.out.print("Enter the price of an eraser: ");
        float c = scanner.nextFloat();

        float total = a+b+c;
        total = total+total*.18f;

        System.out.println("Total price: $"+total);;
        
        scanner.close();
    }
}
