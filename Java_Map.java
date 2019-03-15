import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            hashMap.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (hashMap.containsKey(s)) {
                int number = hashMap.get(s);
                System.out.println(s+"="+number);
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}



// Caner Dabakoglu
// GitHub: https://github.com/cdabakoglu
