public class fiirst {
    
    public static void main(String[] args) {
        int[] arr= {2,1,3,5};
        int target= 9;

        solution sol = new solution();
        int[] index= sol.twoSum(arr,target);
        System.out.println(index[0]+" "+index[1]);
    }

}

class solution{
    public int[] twoSum(int[] arr, int target)
    {
        int[] res=new int[2];

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum = arr[i]+arr[j];
                if(sum==target)
                {
                    res[0]=i;
                    res[1]=j;
                }
            }
        }

        return res;
    }
} 
