import java.util.*;
public class CoupleAlone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            int n = in.nextInt();
            int[] num = new int[n];
            int[] a = new int[501];
            for(int i = 0; i < n; i++){
                num[i] = in.nextInt();
                a[num[i]]++;
            }
            int res = 0;
            for(int i = 0; i < a.length; i++){
                if(a[i] % 2 == 1){
                    res = i;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}