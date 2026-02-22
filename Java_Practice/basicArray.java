import java.util.*;

public class basicArray {

    public static void update(int marks[])
    {
        // Array is call by refarance type
        for(int i=0;i<marks.length;i++)
        {
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[30];
        marks[1] = 95;
        marks[2] = 98;
        System.out.println(marks.length);

        int arr[] = {1,4,3,54,4,2};
        for(int i=0;i<marks.length;i++)
        {
            System.out.print("Mrks = "+marks[i]+" ");
        }
    }
    
}
