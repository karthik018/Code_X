import java.util.*;
public class ServiceLane {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int q = in.nextInt();
    int[] a = new int[n];
    int[][] b = new int[q][2];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    for (int i = 0; i < q; i++) {
      for (int j = 0; j < 2; j++) {
        b[i][j] = in.nextInt();
      }
    }
    for (int i = 0; i < q; i++) {
      int[] arr = Arrays.copyOfRange(a, b[i][0], b[i][1]);
      Arrays.sort(arr);
      System.out.println(arr[0]);
    }
  }
}
