public class subarr {
    public static void subArray(int arr[])
    {
        int sum = 0,ts=0, max = Integer.MIN_VALUE, min= Integer.MAX_VALUE;
        // time complexity o(n^3)
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {   sum =0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                ts++;
                if(sum>max)max=sum;
                if(sum<min)min=sum;
                
                System.out.println(" sum= "+sum);
            }
            System.out.println();
        }
        System.out.println("Total number of sub array= "+ts);
        System.out.println("Maximum sum from the sub array= "+max);
        System.out.println("Minimum sum from the sub array= "+min);
    }
    public static void main(String[] args) {
        int arr[] = {7,-2,5,4,-1,4,};

        subArray(arr);
    }
    
}
