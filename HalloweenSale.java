import java.util.*;
public class HalloweenSale {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int p = in.nextInt();
    int d = in.nextInt();
    int m = in.nextInt();
    int s = in.nextInt();
    int count = 0;
    int cost = p, nCost = p;
    while(cost <= s){
      nCost = nCost - d;
      if(nCost > m){
          count++;
          cost += nCost;
      }else{
          count++;
          cost += m;
      }
    }
    System.out.println(count);
  }
}
