import java.util.Scanner; public class live {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many numbers you want to give: ");

        int n = sc.nextInt();
        int sum_even=0, sum_odd=0;
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter a value: ");
            int num = sc.nextInt();
            if(num%2==0)
            {
                sum_even += num;
            }else{
                sum_odd += num;
            }
        }
        System.out.println("Sum of all even numbers: "+sum_even);
        System.out.println("Sum of all odd numbers: "+sum_odd);


        sc.close();

    }

    
}
