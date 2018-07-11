import java.util.*;
public class SetkBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            int n = in.nextInt();
            int k = in.nextInt();
            String bin = Integer.toString(n, 2);
            int l = bin.length();
            String res = "";
            res = bin.substring(0, l - 1 - k) + "1" + bin.substring(l - k, l);
            System.out.println(Integer.parseInt(res, 2));
        }
    }
}