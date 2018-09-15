import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class ReverseSubstring {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strs = new String[n];
        for(int i = 0; i < n; i++){
            String res = "";
            strs[i] = in.next();
            int l = strs[i].length();
            int N = in.nextInt();
            int M = in.nextInt();
            String substr = strs[i].substring(N, M + 1);
            char[] cstr = substr.toCharArray();
            Arrays.sort(cstr);
            substr = new String(cstr);
            StringBuffer str = new StringBuffer(substr);
            res += strs[i].substring(0, N) + str.reverse() + strs[i].substring(M + 1);
            System.out.println(res);
        }
    }
}
