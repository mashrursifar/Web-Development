public class binSearch {
    
    public static int binarySearch(int num[],int key)
    {
        int start =0, end= num.length-1;
        while (start<=end) {
            int mid = (start+end)/2;

            if(num[mid]==key) {
                return mid;
            }
            else if (num[mid]<key) {
                start = mid+1;
            } else {
                end = mid-1;
            }

            
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1,2,3,7,9,13,43,46};
        int key = 46;

        int index = binarySearch(number, key);

        if(index==-1) System.out.println("key does not found");
        else System.out.println("Key found at "+index+" index");
    }
    
}
