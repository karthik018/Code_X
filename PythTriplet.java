import java.util.*;
public class PythTriplet{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int n = in.nextInt();
      int b = n / 3;
      int mid = (int)Math.ceil(n / 2.0); System.out.println(b + " " + mid);
      int res = -1;
      int flag = 0;
      for(int a = b - 1; a >= 1; a--){
        for (int c = b + 1; c <= mid; c++) {
          System.out.println(a + " " + b + " " + c);
          if(a + b + c == n){
            if(a * a + b * b == c * c){
                res = a * b * c;
                flag = 1;
            }
          }
        }
        if(flag == 1)
          break;
      }
      System.out.println(res);
    }
  }
}
