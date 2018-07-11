import java.util.*;
public class SmallElement{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                a[j] = in.nextInt();
            }
            for(int j = 0; j < n - 1; j++){
                if(a[j+1] < a[j])
                    System.out.print(a[j+1] + " ");
                else
                    System.out.print(-1 + " ");
            }
            System.out.println(-1);
        }
    }
}