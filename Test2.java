import java.util.*;
public class Test2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    for (int i = 0; i < n - 1; i += 2) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
