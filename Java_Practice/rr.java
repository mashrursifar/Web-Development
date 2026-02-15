import java.util.Scanner;


public class rr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int r=0;r<=n;r++)
        {
            for(int c=n-r;c>0;c--)
            {
                
                System.out.print("*");
            }
       
            System.out.println();
        }
        sc.close();
        
    }

   
    
    
}
