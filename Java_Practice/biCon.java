public class biCon {
    
    
    public static int fact(int n)
    {
        int res=1;
        
        for(int i=1; i<=n;i++)
        {
            res *=i;
        }

        
        return res;}

    public static int bi(int n, int r)
    {
        int f_n = fact(n);
        int f_r = fact(r);
        int f_nr = fact(n-r);

        return f_n/(f_r*f_nr);
    }

    

    public static void main(String[] args) {
        System.out.println(bi(7,4));
    }
}
