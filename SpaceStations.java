import java.util.*;
public class SpaceStations{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int t = in.nextInt();
    int[] ss = new int[t];
    for (int i = 0; i < t; i++) {
      ss[i] = in.nextInt();
    }
    int max = 0;
    for (int i = 0; i < n; i++) {
      int min = Integer.MAX_VALUE;
      for (int j = 0; j < t; j++) {
        int diff = Math.abs(i - ss[j]);
        if(diff < min)
          min = diff;
      }
      if(min > max)
        max = min;
    }
    System.out.println(max);
  }
}
