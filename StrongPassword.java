import java.util.*;
import java.util.regex.*;
public class StrongPassword {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int l = in.nextInt();
    String password = in.next();
    int res = 0, res1 = 0;
    if(l < 6){
      res = 6 - l;
    }
    Pattern npat = Pattern.compile("[0-9]+");
    Pattern lpat = Pattern.compile("[a-z]+");
    Pattern upat = Pattern.compile("[A-Z]+");
    Pattern spat = Pattern.compile("[-!@#$%^&*()+]+");
    Matcher nmat = npat.matcher(password);
    Matcher lmat = lpat.matcher(password);
    Matcher umat = upat.matcher(password);
    Matcher smat = spat.matcher(password);
    if(nmat.find() == false){
      System.out.println("n");
      res1 += 1;
    }
    if(lmat.find() == false){
      System.out.println("l");
      res1 += 1;
    }
    if(umat.find() == false){
      System.out.println("u");
      res1 += 1;
    }
    if(smat.find() == false){
      System.out.println("s");
      res1 += 1;
    }
    if(res1 > res)
      System.out.println(res1);
    else
      System.out.println(res);
  }
}
