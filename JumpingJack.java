import java.util.*;
public class JumpingJack {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int dist = in.nextInt();
        int k = in.nextInt();
        int n = in.nextInt();
        int distance = 0;
        for(int i = 0; i <= n; i++){
            if(i % k != 0){
                distance += dist;
            }
        }
        System.out.println(distance);
    }
}