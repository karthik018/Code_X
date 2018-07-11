import java.util.*;
public class DiffBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            int m = in.nextInt();
            int n = in.nextInt();
            String mbin = Integer.toString(m, 2);
            String nbin = Integer.toString(n, 2);
            int ml = mbin.length();
            int nl = nbin.length();
            int l = ml;
            String tr = "";
            if(ml > nl){
                for(int i = 0; i < ml - nl; i++)
                    tr += "0";
                nbin = tr + nbin;
                l = ml;
            }
            else if(ml < nl){
                for(int i = 0; i < nl - ml; i++)
                    tr += "0";
                mbin = tr + mbin;
                l = nl;
            }
            int res = 0;
            for(int i = l - 1; i >= 0; i--){
                if(mbin.charAt(i) != nbin.charAt(i)){
                    res = l - i;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}