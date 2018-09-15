import java.util.*;
public class SumXor{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong(), count = 0;
    for (int i = 0; i < n; i++) {
      if(((n + i) ^ i) == n)
        count++;
    }
    System.out.println(count);
  }
}
