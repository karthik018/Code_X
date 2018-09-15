import java.util.*;
public class RemoveElement {
	static int sum = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if(map.containsKey(num)){
				Integer a = map.get(num);
				a += 1;
				map.put(num, a);
			}
			else
				map.put(num, 1);
		}
		int val = in.nextInt();
		map.remove(val);
		map.forEach((key, value) -> sum += value);
		System.out.println(sum);
	}
}