import java.util.Scanner;

public class numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        int num=1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(j<n-i)
                {System.out.print(" ");}
                else
                {
                    for(int k=0;k<num*2-1;k++)
                    {
                        System.out.print(num);
                    }
                    break;
                    
                    
                }
               
            }
            num++;
            System.out.println();

        }
        sc.close();
    }
    
}
