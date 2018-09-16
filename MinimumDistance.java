import java.util.*;
public class MinimumDistance {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int min = Integer.MAX_VALUE;
    int count = 0;
    for (int i = 0; i < n; i++) {
      if(map.containsKey(a[i]) == false){
        map.put(a[i], i);
      }else{
        count++;
        int diff = i - map.get(a[i]);
        if(diff < min)
          min = diff;
        map.put(a[i], diff);
      }
    }
    if(count == 0)
      System.out.println(-1);
    else
      System.out.println(min);
  }
}
