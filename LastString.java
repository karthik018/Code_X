import java.util.*;
public class LastString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int l = str.length();
		int count = 0;
		if(l == 0)
			count = 0;
		int j = l - 1;
		int count1 = 0;
		while(str.charAt(j) == ' ' && j > 0){
			count1 += 1;
			j--;
		}
		if(j < 0)
			count = 0;
		l -= count1;
		for (int i = l - 1; i >= 0; i--) {
			if(str.charAt(i) != ' ')
				count++;
			else
				break;
		}
		System.out.println(count);
	}
}