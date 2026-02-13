import java.util.Scanner; public class live {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many numbers you want to give: ");

        int n = sc.nextInt();
        int evenSum=0, oddSum=0;

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter a value: ");
            int num = sc.nextInt();
            if(num%2==0)
            {
                evenSum += num;
            }else{
                oddSum += num;
            }
        }
        System.out.println("Sum of all even numbers: "+evenSum);
        System.out.println("Sum of all odd numbers: "+oddSum);


        sc.close();

    }

    
}
