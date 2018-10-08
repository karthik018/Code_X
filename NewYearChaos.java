import java.util.*;
public class NewYearChaos{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int k = 0; k < t; k++){
      int n = in.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
      }
      int min_bribe = 0;
      String res = "";
      for (int i = 0; i < n; i++) {
        int diff = 0;
        if(a[i] > i + 1){
          diff = a[i] - (i + 1);
          if(diff <= 2){
            min_bribe += diff;
            res = Integer.toString(min_bribe);
          }
          else{
            res = "Too chaotic";
            break;
          }
        }
      }
      System.out.println(res);
    }
  }
}
