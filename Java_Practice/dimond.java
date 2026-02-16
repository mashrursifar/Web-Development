import java.util.Scanner;

public class dimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt();
        int pr = 1;

        // Upper 

        for(int i=0;i<n;i++)
        {
            for(int j=0; j<=n;j++)
            {
                if(j<n-i)
                {
                    System.out.print(" ");
                }else{
                    for(int k=0; k<pr*2-1;k++)
                    {
                        System.out.print("*");
                    }
                    break;
                    
                }
                
                
            }
            pr++;
            System.out.println();
        }

        // Lower
        
        pr = n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=n; j>0;j--)
            {
                if(j<n-i)
                {
                    System.out.print(" ");
                    for(int k=0; k<pr*2-1;k++)
                    {
                        System.out.print("*");
                    }
                    break;
                }else{
                    
                    System.out.print(" ");
                }
                
                
            }
            pr--;
            System.out.println();
        }

        sc.close();
    }
}
