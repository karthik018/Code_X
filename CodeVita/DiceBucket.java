import java.util.*;
public class DiceBucket {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(23, 115); map.put(30, 270); map.put(31, 124);
		map.put(25, 50); map.put(35, 210); map.put(40, 40);
		map.put(32, 160); map.put(33, 264); map.put(27, 108);
		map.put(37, 111); map.put(38, 152); map.put(19, 38);
		map.put(36, 216); map.put(26, 104); map.put(20, 60); 
		map.put(14, 14); map.put(29, 116); map.put(34, 170); 
		map.put(18, 36); map.put(16, 16); map.put(22, 66); 
		map.put(41, 82); map.put(47, 47); map.put(28, 168); 
		map.put(39, 156); map.put(13, 13); map.put(45, 45);
		map.put(44, 44); map.put(24, 24); map.put(12, 12);
		int size = in.nextInt();
		int consumed = 0;
		int overflow = 0;
		int total = 49 * size;
		int n = map.size();
		for(Integer k : map.keySet()){
			if(map.get(k) > size){
				consumed += size;
				overflow += map.get(k) - size;
			}
			else
				consumed += map.get(k);
		}
		System.out.println(consumed);
		System.out.println(overflow);
		System.out.println(total - consumed);
	}
}