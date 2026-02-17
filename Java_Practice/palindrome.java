import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        

        String s ="";

        for(int i=str.length()-1;i>-1;i--)
        {
            s =s+ str.charAt(i);
        }
        System.out.println(str.equals(s));

        sc.close();
    }
    
}
