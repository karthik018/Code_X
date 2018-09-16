import java.util.*;
public class ChocolateFeast {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int j = 0; j < t; j++) {
      int n = in.nextInt();
      int c = in.nextInt();
      int m = in.nextInt();
      int count = n/c;
      int wrappers = count;
      while(wrappers >= m){
        count += wrappers/m;
        wrappers = wrappers/m + wrappers % m;
      }
      System.out.println(count);
    }
  }
}
