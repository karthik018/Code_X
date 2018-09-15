import java.util.*;
public class BrideHunting {

	static boolean isValid(int n, int m, int x, int y){
		if(x == 0 && y == 0)
			return false;
		if((x >= 0 && x < n) && (y >= 0 && y < m))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] houses = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				houses[i][j] = in.nextInt();
			}
		}
		int[][] qualities = new int[n][m];
		int[][] maximum = new int[n * m][2];
		int k = 0;
		int max = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(i == 0 && j == 0)
					continue;
				int count = 0;
				if(houses[i][j] > 0){
					if(isValid(n,m,i-1,j-1)){
						if(houses[i-1][j-1] > 0)
							count++;
					}
					if(isValid(n,m,i,j-1)){
						if(houses[i][j-1] > 0)
							count++;
					}
					if(isValid(n,m,i+1,j-1)){
						if(houses[i+1][j-1] > 0)
							count++;
					}
					if(isValid(n,m,i-1,j)){
						if(houses[i-1][j] > 0)
							count++;
					}
					if(isValid(n,m,i+1,j)){
						if(houses[i+1][j] > 0)
							count++;
					}
					if(isValid(n,m,i-1,j+1)){
						if(houses[i-1][j+1] > 0)
							count++;
					}
					if(isValid(n,m,i,j+1)){
						if(houses[i][j+1] > 0)
							count++;
					}
					if(isValid(n,m,i+1,j+1)){
						if(houses[i+1][j+1] > 0)
							count++;
					}
					qualities[i][j] = count;
					if(max < count){
						max = count;
						maximum[0][0] = i;
						maximum[0][1] = j;
						k = 1;
					}
					else if(max == count){
						maximum[k][0] = i;
						maximum[k][1] = j;
						k++;
					}
				}
			}
		}
		int[] distance = new int[k];
		int[][] dist = new int[k][2];
		int j = 0;
		if(k == 0)
			System.out.println("No suitable girl found");
		else{
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < k; i++) {
				distance[i] = Math.max(maximum[i][0], maximum[i][1]);
				if(distance[i] < min){
					min = distance[i];
					dist[0][0] = maximum[i][0];
					dist[0][1] = maximum[i][1];
					j = 1;
				}
				else if(distance[i] == min){
					dist[j][0] = maximum[i][0];
					dist[j][1] = maximum[i][1];
					j++;
				}
			}
			if(j > 1)
				System.out.println("Polygamy not allowed");
			else{
				int x = dist[0][0];
				int y = dist[0][1];
				System.out.println((x + 1) + ":" + (y + 1) + ":" + qualities[x][y]);
			}
		}
	}
}