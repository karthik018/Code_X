import java.util.*;

public class JumGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int index = 0;
		int[] a = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n-1; i++) {
			int num = in.nextInt();
			a[i] = num;
			if(map.containsKey((i+num)))
				continue;
			else{
				if((i + num) >= n - 1){
					index = i;
					break;
				}
				map.put((i+num), num);
			}
		}
		System.out.println(map);
		System.out.println(index);
		int count = 0, i = 0;
		if(index == 0){
			count = 0;
			while(i < n - 1){
				if((i+a[i]) > n - 1){
					count += 1;
					break;
				}
				else{
					i += a[i];
					count += 1;
				}
			}
		}

		else{
			count = 1;
			while(i < index) {
				if((i+a[i]) > index){
					count += 1;
					break;
				}
				else{
					i += a[i];
					count += 1;
				}
			}
		}
		System.out.println(count);
	}
}