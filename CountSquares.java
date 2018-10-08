import java.util.*;
public class CountSquares {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int j = 0; j < t; j++) {
      int n = in.nextInt();
      int sqrt = (int)Math.ceil(Math.sqrt(n));
      System.out.println(sqrt - 1);
    }
  }
}
