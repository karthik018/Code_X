import java.util.*;
public class ToggleBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            int n = in.nextInt();
            int l = in.nextInt();
            int r = in.nextInt();
            String bin = Integer.toString(n, 2);
            int L = bin.length();
            String res = "";
            for(int i = L - r; i <= L - l; i++){
                if(bin.charAt(i) == '0')
                    res += "1";
                else if(bin.charAt(i) == '1')
                    res += "0";
            }
            res = bin.substring(0, L - r) + res + bin.substring(L - l + 1, L);
            System.out.println(Integer.parseInt(res, 2));
        }
    }
}