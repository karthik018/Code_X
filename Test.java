import java.util.*;
import java.text.*;
public class Test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long start = System.currentTimeMillis();
    int t = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        t = n - j;
        int k = 0;
        while(k < n - i){
          System.out.print(t + " ");
          k++;
        }
      }
      System.out.println();
      long end = System.currentTimeMillis();
      NumberFormat formatter = new DecimalFormat("#0.00000");
      System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
  }
}
