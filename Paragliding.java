import java.util.*;
import java.io.*;
public class Paragliding {
	static Scanner in;
	static void fill(int[] a, int t, int r){
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int M = in.nextInt();
		while(t < r){
			a[t] = (A * a[t -1] + B * a[t - 2] + C) % M + 1;
			t++;
		}
	}

	public static void main(String[] args) {
		try{
			in = new Scanner(new File("Paragliding_in.txt"));
			FileOutputStream out = new FileOutputStream("Paragliding_out.txt");
			System.setOut(new PrintStream(out));
			int T = in.nextInt();
			for (int j = 0; j < T; j++) {
				int n = in.nextInt();
				int k = in.nextInt();
				int[] p = new int[n];
				int[] h = new int[n];
				int[] x = new int[k];
				int[] y = new int[k];
				for (int i = 0; i < 4; i++) {
					int n1 = in.nextInt();
					int n2 = in.nextInt();
					if(i == 0){
						p[0] = n1;
						p[1] = n2;
						fill(p, 2, n);
					}
					else if(i == 1){
						h[0] = n1;
						h[1] = n2;
						fill(h, 2, n);
					}
					else if(i == 2){
						x[0] = n1;
						x[1] = n2;
						fill(x, 2, k);
					}
					else{
						y[0] = n1;
						y[1] = n2;
						fill(y, 2, k);
					}
				}
				int count = 0;
				for (int i = 0; i < k; i++) {
					int x_b = x[i];
					int y_b = y[i];
					for (int t = 0; t < n; t++) {
						int p_t = p[t];
						int h_t = h[t];
						int intr = y_b + Math.abs(p_t - x_b);
						if(intr <= h_t){
							count += 1;
							break;
						}
					}
				}
				System.out.print("Case #" + (j+1) + ":" + " ");
				System.out.println(count);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}