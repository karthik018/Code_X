import java.util.*;
public class CheckSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            int n = in.nextInt();
            int k = in.nextInt();
            String bin = Integer.toString(n, 2);
            int l = bin.length();
            if(bin.charAt(l - 1 - k) == '1')
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}