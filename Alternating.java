import java.util.*;
public class Alternating {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    for (int i = 0; i < n; i++) {
      int count = 1;
      for (int j = i; j < n - 1; j++) {

      }
      System.out.println("Index " + (i + 1) + ", " + count);
    }
  }
}
