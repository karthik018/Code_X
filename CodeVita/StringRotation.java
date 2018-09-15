import java.util.*;
public class StringRotation {

	static int anagram(String s1, String s2){
		int[] a = new int[256];
		int[] b = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			a[s1.charAt(i)]++;
			b[s2.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if(a[i] != b[i])
				return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String tempStr = str;
		String firstStr = "";
		int q = in.nextInt();
		int l = str.length();
		for (int i = 0; i < q; i++) {
			char d = in.next().charAt(0);
			int magnitude = in.nextInt();
			if(magnitude > l)
				magnitude -= l;
			if(d == 'L'){
				str = str.substring(magnitude, l) + str.substring(0, magnitude);
				firstStr += str.charAt(0);
			}
			else if(d == 'R'){
				str = str.substring(l - magnitude, l) + str.substring(0, l - magnitude);
				firstStr += str.charAt(0);
			}
		}
		int f_l = firstStr.length();
		String subStr = "";
		int flag = 0;
		for (int i = 0; i <= l - f_l; i++) {
			subStr = tempStr.substring(i, i + f_l);
			if(anagram(firstStr, subStr) == 1){
				System.out.println("YES");
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("NO");
	}
}