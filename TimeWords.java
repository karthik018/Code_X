import java.util.*;
public class TimeWords {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int h = in.nextInt();
    int m = in.nextInt();
    String res = "";
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(00, "o' clock");
    map.put(01, "one minute past");
    map.put(10, "ten minutes past");
    map.put(15, "quarter past");
    map.put(29, "twenty nine minutes past");
    map.put(30, "half past");
    map.put(35, "twenty five minutes to");
    map.put(40, "twenty minutes to");
    map.put(45, "quarter to");
    map.put(47, "thirteen minutes to");
    map.put(57, "three minutes to");
    map.put(28, "twenty eight minutes past");
    HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    hmap.put(1, "one");  hmap.put(8, "eight");
    hmap.put(2, "two");  hmap.put(9, "nine");
    hmap.put(3, "three");  hmap.put(10, "ten");
    hmap.put(4, "four"); hmap.put(11, "eleven");
    hmap.put(5, "five"); hmap.put(12, "twelve");
    hmap.put(6, "six");
    hmap.put(7, "seven");
    if(m == 0)
      res += hmap.get(h) + " " + map.get(m);
    else if(m > 0 && m <= 30){
      res += map.get(m) + " " + hmap.get(h);
    }else{
      res += map.get(m) + " " + hmap.get(h + 1);
    }
    System.out.println(res);
  }
}
