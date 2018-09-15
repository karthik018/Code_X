import java.util.*;
public class BFS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		int n = in.nextInt();
		int[][] adj = new int[n][n];
		int[] level = new int[n];
		boolean[] vis = new boolean[n];
		for(int i = 0; i < n; i++){
			int a = in.nextInt();
			int b = in.nextInt();
			adj[a-1][b-1] = 1;
		}
		q.add(0);
		level[0] = 0;
		vis[0] = true;
		while(q.size() != 0){
			int p = q.poll();
			System.out.print(p + " ");
			
		}
		System.out.println();
	}
}