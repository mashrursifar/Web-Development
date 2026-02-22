public class linearSearch {

    public static int linearSearch(String num[],String key)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==key)return i;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,2,43,3,46,9,7,13};
        int key = 91;
        String name[] = {"sifar","tahsin","sourav"};
        String keys = "sifar";

        int index = linearSearch(name,keys);
        
        if(index==-1) System.out.println("Key does not found");
        else System.out.println("Key is found");


    }
    
}
