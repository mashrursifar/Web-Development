public class reverse {
    public static void rev(int rev[])
    {
        int first=0, last=rev.length-1, temp=0;

        while (first<last) {
            temp = rev[last];
            rev[last] = rev[first];
            rev[first] = temp;
            first++;
            last--;

        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,36,5,4};

        rev(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
