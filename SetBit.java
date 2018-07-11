import java.util.*;
public class SetBit{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            int n = in.nextInt();
            String bin = Integer.toString(n ,2);
            int l = bin.length();
            int res = 0;
            if(n == 0)
                res = 0;
            else{
                for(int i = l - 1; i >= 0; i--){
                    if(bin.charAt(i) == '1'){
                        res = l - i;
                        break;
                    }
                }
            }
            System.out.println(res);
        }
    }
}