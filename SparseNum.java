import java.util.*;
public class SparseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            int n = in.nextInt();
            String bin = Integer.toString(n, 2);
            int l = bin.length();
            System.out.println(bin);
            int flag = 0;
            for(int i = 0; i < l - 1; i++){
                System.out.println(bin.charAt(i) + " " + bin.charAt(i + 1));
                if((bin.charAt(i) == '1') && (bin.charAt(i + 1) == '1')){
                    flag = 1;
                    break;
                }
            }
            System.out.println(flag);
            if(flag == 0)
                System.out.println(1);
            if(flag == 1)
                System.out.println(0);
        }
    }
}