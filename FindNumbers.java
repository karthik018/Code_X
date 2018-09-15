import java.util.*;
public class FindNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int j = 0; j < t; j++) {
			int n = in.nextInt();
			HashMap<Integer, Integer> map1 = new HashMap<>();
			for (int i = 0; i < 2 * n + 2; i++) {
				int num = in.nextInt();
				if(map1.containsKey(num)){
					Integer a = map1.get(num);
					a += 1;
					map1.put(num, a);
				}
				else
					map1.put(num, 1);
			}
			Map<Integer, Integer> map = new TreeMap<>(map1);
			System.out.println(map);
			for(Map.Entry m : map.entrySet()){
			 	Object c = (Integer) 1;
				if(m.getValue().equals(c))
					System.out.print(m.getKey() + " ");
			}
			System.out.println();
		}
	}
}