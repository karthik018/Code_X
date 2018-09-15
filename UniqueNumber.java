import java.util.*;
public class UniqueNumber{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = 0;
    for (int i = 0; i < n; i++) {
      int b = in.nextInt();
      a ^= b;
      System.out.println("a: " + a);
    }
    System.out.println(a);
  }
}
