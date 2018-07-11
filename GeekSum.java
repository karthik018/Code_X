import java.util.*;
public class GeekSum {

	static int isPrime(int n){
		int flag = 0;
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0){
				flag = 1;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] f = new int[n+2];
			f[0] = 0;
			f[1] = 1;
			int sum = 0;
			for(int j = 2; j < n; j++){
				f[j] = f[j - 1] + f[j - 2];
				if(isPrime(j) == 0)
					sum += f[j];
			}
			for (int j = 0; j < f.length - 2; j++) {
				System.out.print(f[j] + " ");
			}
			System.out.println();
			System.out.println(sum);
		}
	}
}