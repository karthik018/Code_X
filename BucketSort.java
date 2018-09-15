import java.util.*;
public class BucketSort {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    float[] input = new float[n];
    for (int i = 0; i < n; i++) {
      input[i] = in.nextFloat();
    }

    ArrayList<LinkedList<Float>> list = new ArrayList<LinkedList<Float>>();
    for (int i = 0; i < n; i++) {
      list.add(new LinkedList<Float>());
    }
    for (int i = 0; i < n; i++) {
      int index = (int)(n * input[i]);
      list.get(index).add(input[i]);
    }
    for(int i = 0; i < list.size(); i++){
      if(list.get(i).size() != 0){
        Collections.sort(list.get(i));
        System.out.print(list.get(i) + " ");
      }
    }
    System.out.println();
  }
}
