import java.util.*;
public class EllysChocolates {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int k = in.nextInt();
		int n = in.nextInt();
		int t = n/p;
		int count = t;
		while(t > 1){
			t /= k;
			count += t;
		}
		System.out.println(count);
	}
}