import java.util.*;
public class PrinitingBooks{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      long n = in.nextLong();
      long x = in.nextLong();
      long num_digits = 0, num_pages = 0;
      long result = 0;
      for(long j = x;; j++){
        String number = Long.toString(j);
        num_digits += number.length();
        num_pages++;
        if(num_digits > n){
          result = -1;
          break;
        }
        else if(num_digits == n){
          result = num_pages;
          break;
        }
      }
      System.out.println(result);
    }
  }
}
