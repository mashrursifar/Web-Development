import java.util.*;
public class Test{


    public static void main(String args []){
        System.out.print("Hello! Sifar. How are you?\n");
        System.out.println("Yes, I am fine!!");



        Scanner sc = new Scanner(System.in);

        boolean a = sc.nextBoolean();

        System.out.println(a);
        int x=5;
        int y = 5, z = 7;

        int res = x*y/z;
        System.out.println(res);

        sc.close();

    }
}