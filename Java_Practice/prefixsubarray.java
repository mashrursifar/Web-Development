public class prefixsubarray {

    public static void preMax(int arr[])
    {
        int prefix[] = new int[arr.length];
        int sum=0;

        prefix[0] = arr[1];

        for(int i=1; i<arr.length;i++)
        {
            for(int j=1; j<arr.length;j++)
            {
                prefix[j] = arr[i]+
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,5,4};

        preMax(arr);

    }
    
}
