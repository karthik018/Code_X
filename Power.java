import java.util.*;
public class Power {
	static double power(double x, int y){
		double temp;
		if(y == 0)
			return 1;
		temp = power(x, y/2);
		System.out.println(temp);
		if(y%2 == 0)
			return temp * temp;
		else{
			if(y > 0)
				return x * temp * temp;
			else
				return (temp * temp)/x;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		int y = in.nextInt();
		System.out.println(power(x, y));
	}
}