import java.util.*;

public class minMax {

    public static int[] getMinMax(int num[])
    {
        int largest = Integer.MIN_VALUE;    //-infinity
        int smallest = Integer.MAX_VALUE;   //+infinity

        for(int i=0;i<num.length;i++)
        {
            if(num[i] > largest) largest=num[i];

            if(num[i] < smallest) smallest = num[i];

        }

        
        return new int[]{largest,smallest};

    }

    public static void main(String[] args) {
        int numbers[] = {1,3,5,3,9,4,23,4,7,-2};

        int maxMin[] = getMinMax(numbers);

        System.out.println("Largest number: "+maxMin[0]);
        System.out.println("Smallest number: "+maxMin[1]);
    }
    
}
