import java.util.*;
import java.math.BigInteger;
public class AddBinary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		Long x = new BigInteger(a, 2).longValue();
        Long y = new BigInteger(b, 2).longValue();
        Long s = x + y;
        String r = Long.toBinaryString(s);
        System.out.println(r);
	}
}