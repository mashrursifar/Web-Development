import java.util.Scanner; public class live {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many numbers you want to give: ");

        int n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            System.out.print("Enter a value: ");
            int num = sc.nextInt();
            System.out.println("User Enterd: "+num);
        }




    }

    
}
