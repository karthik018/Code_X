import java.util.*;
public class SubArraySum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int j = 0; j < t; j++) {
			int n = in.nextInt();
			int s = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int flag = 0;
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int k = i; k < n; k++) {
					sum += a[k];
					if(sum == s){
						System.out.println((i + 1) + " " + (k + 1));
						flag = 1;
						break;
					}
				}
				if(flag == 1)
					break;
			}
			if(flag == 0)
				System.out.println("-1");
		}
	}
}