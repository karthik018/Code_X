import java.util.*;
public class SetBits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            Long n = in.nextLong();
            String bin = Long.toString(n, 2);
            int l = bin.length();
            int count = 0;
            for(int i = 0; i < l; i++){
                if(bin.charAt(i) == '1')
                    count += 1;
            }
            System.out.println(count);
        }
    }
}