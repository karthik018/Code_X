import java.util.*;
public class TShaped {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < 5; i++) {
      list.add(new ArrayList<Integer>());
    }
    for (int j = 0; j < t; j++) {
      for (int i = 0; i < 5; i++) {
        for (int k = 0; k < 2; k++) {
          list.get(i).add(in.nextInt());
        }
      }
      int countx = 0, county = 0;
      int[] x = new int[5];
      int[] y = new int[5];
      for (int i = 0; i < 5; i++) {
        x[i] = list.get(i).get(0);
        y[i] = list.get(i).get(1);
      }
      int[] ty = new int[3];
      int[] tx = new int[3];
      for(int i = 0; i < 4; i++){
        ty[0] = y[i];
        System.out.println(ty[0]);
        int p = 1;
        for (int k = i + 1; k < 5; k++) {
          if(x[i] == x[k]){
            countx++;
            ty[p++] = y[k];
          }
        }
        if(countx == 3)
          break;
      }
      System.out.println(Arrays.toString(ty));
    }
  }
}
