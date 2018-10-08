import java.util.*;
public class Anagrams{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int k = 0; k < t; k++) {
      String str = in.next();
      int n = str.length(), count = 0;
      HashMap<String, Integer> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
        for(int j = i + 1; j <= n; j++){
          String substr = str.substring(i,j);
          char[] arr = substr.toCharArray();
          Arrays.sort(arr);
          substr = new String(arr);
          if(map.containsKey(substr) == false)
            map.put(substr, 1);
          else{
            map.put(substr, map.get(substr) + 1);
          }
        }
      }
      System.out.println(map);
      for(String key : map.keySet()){
        if(map.get(key) > 1)
          count++;
      }
      System.out.println(count);
    }
  }
}
