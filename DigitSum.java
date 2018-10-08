import java.util.*;
public class DigitSum{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int k = 0; k < t; k++){
      int n = in.nextInt();
      long power = (long)Math.pow(2, n);
      System.out.println(power);
    }
  }
}
