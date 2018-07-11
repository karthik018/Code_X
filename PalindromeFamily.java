import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class PalindromeFamily {

    static int isPalindrome(String s){
        int l = s.length();
        String reverString = "";
        for(int i = l - 1; i >= 0; i--)
            reverString += s.charAt(i);
        if(s.equals(reverString))
            return 1;
        return 0;    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            String s = in.next();
            int n = s.length();
            String odd = "";
            String even = "";
            for(int j = 0; j < n; j += 2){
                odd += s.charAt(j);
            }
            for(int j = 1; j < n - 1; j += 2){
                even += s.charAt(j);
            }
            if(isPalindrome(s) == 1)
                System.out.println("PARENT");
            //System.out.println(odd + " " + even);
            else if(isPalindrome(odd) == 1)
                System.out.println("ODD");
            else if(isPalindrome(even) == 1)
                System.out.println("EVEN");
            else
                System.out.println("ALIEN");
        }
        in.close();
    }
}