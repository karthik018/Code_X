import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int d = in.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++){
                a[j] = in.nextInt();
            }
            for(int j = n -1; j >= 0; j--){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
// if(d>n){
//     for(int j=Math.abs(n-d);j<n;j++)
//         System.out.print(a[j]+" ");
//     for(int j=0;j<Math.abs(n-d);j++)
//         System.out.print(a[j]+" ");
// }
// else{
//     for(int j=d;j<n;j++)
//         System.out.print(a[j]+" ");
//     for(int j=0;j<d;j++)
//         System.out.print(a[j]+" ");
// }
// System.out.println();