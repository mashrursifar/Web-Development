public class prefixsubarray {

    public static void preMax(int arr[])
    {
        int prefix[] = new int[arr.length];
        int sum=0, max = Integer.MIN_VALUE;

        prefix[0] = arr[0];

        for(int i=1; i<arr.length;i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=1; i<arr.length;i++)
        {
            for(int j=i; j<arr.length;j++)
            {
                sum = i==0 ? prefix[j]:prefix[j] -prefix[i-1];

                if(max<sum) max=sum;
            }
        }
        System.out.println("Max sum = "+max);
    }

    public static void main(String[] args) {
        int arr[] = {7,-2,5,4,-1,4};

        preMax(arr);

    }
    
}
