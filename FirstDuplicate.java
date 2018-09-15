import java.util.*;
public class FirstDuplicate {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n+1];
    int[] num = new int[10];
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    int res = -1;
    for (int i = 0; i < n; i++) {
      num[a[i]]++;
      if(num[a[i]] == 2){
        if(i < min){
            min = i;
            res = a[i];
        }
      }
    }
    System.out.println(Arrays.toString(num));
    System.out.println(res);
  }
}
