public class numberPyramid {
    public static void main(String[] args) {
        int n=4;
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
                // if(num>1)
                //     {
                //     for(int k=0;k<i;k++)
                //     {
                //         System.out.print(num);
                //     }
                //     }
                
            }
            num++;
            System.out.println();

        }
    }
    
}
