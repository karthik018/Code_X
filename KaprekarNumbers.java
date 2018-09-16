import java.util.*;
public class KaprekarNumbers {

  static int nDigits(int n){
    String number = Integer.toString(n);
    return number.length();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p = in.nextInt();
    int q = in.nextInt();
    int count = 0;
    for (int i = p; i <= q; i++) {
      int d = nDigits(i);
      int sum = 0;
      long square = (long)Math.pow(i, 2);
      String sqStr = Long.toString(square);
      int length = sqStr.length();
      String rStr = sqStr.substring(length - d, length);
      String lStr = sqStr.substring(0, length - d);
      int r = Integer.valueOf(rStr);
      if(length == 1){
        sum = r;
      }else{
        int l = Integer.valueOf(lStr);
        sum = r + l;
      }
      if(sum == i){
        count++;
        System.out.print(i + " ");
      }
    }
    if(count == 0)
      System.out.print("INVALID RANGE");
    System.out.println();
  }
}
