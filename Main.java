import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(a.size());
    for (int i = 0; i < a.size(); i++) {
      int n = in.nextInt();
      a.add(n);
    }
    a.forEach(System.out::println);
  }
}
