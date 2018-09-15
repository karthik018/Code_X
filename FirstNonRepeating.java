import java.util.*;
public class FirstNonRepeating {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    int[] a = new int[26];
    char[] c = new char[str.length()];
    int j = 0;
    for (int i = 0; i < str.length(); i++) {
      a[str.charAt(i) - 'a']++;
      c[j++] = str.charAt(i);
    }
    System.out.println(Arrays.toString(a));
    char res = '_';
    for (int i = 0; i < j; i++) {
      if(a[c[i]] == 1){
        res = c[i];
        break;
      }
    }
    System.out.println(res);
  }
}
