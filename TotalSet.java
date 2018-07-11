import java.util.*;
public class TotalSet {

    static int countBits(String bin){
        int l = bin.length();
        int count = 0;
        for(int i = 0; i < l; i++){
            if(bin.charAt(i) == '1')
                count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            int n = in.nextInt();
            int count = 1;
            for(int i = 2; i <= n; i++){
                String bin = Integer.toString(i, 2);
                count += countBits(bin);
            }
            System.out.println(count);
        }
    }
}