import java.util.*;
public class Binary{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int j = 0; j < t; j++){
            int n = in.nextInt();
            String s = Integer.toString(n,2);
            int l = s.length();
            String res = "";
            if(l < 14){
                for(int i = 0; i < 14 - l; i++)
                    res += "0";
                res += s;
            }
            else{
                res = s.substring(l - 14, l);
            }
            System.out.println(res);
        }
        in.close();
    }
}