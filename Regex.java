import java.util.regex.*;
import java.util.*;
public class Regex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    Pattern pat1 = Pattern.compile("(<\\?[a-zA-Z0-9]+>)+");
    Pattern pat2 = Pattern.compile("(<[a-zA-Z0-9]+>)+");
    Matcher mat1 = pat1.matcher(str);
    Matcher mat2 = pat2.matcher(str);
    if(mat1.find() || mat2.find()){
      System.out.println(mat1.group() + " " + mat2.group());
    }else{
      System.out.println(false);
    }
  }
}
