import java.util.*;
public class BinaryString {

  static void binaryString(int n, int[] A){
    if(n <= 0){
      System.out.println(Arrays.toString(A));
    }
    else{
        A[n - 1] = 0;
        System.out.println("n: " + n + " A: " + A[n - 1]);
        binaryString(n - 1, A);
        A[n - 1] = 1;
        System.out.println("n: " + n + " A: " + A[n - 1]);
        binaryString(n - 1, A);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] A = new int[n];
    binaryString(n, A);
  }
}
