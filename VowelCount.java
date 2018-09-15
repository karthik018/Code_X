import java.util.*;

class VowelCount {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String s = in.nextLine();
        for(int i = 0; i < t; i++){
            String str = in.nextLine();
            int l = str.length();
            int count = 0;
            for(int j = 0; j < l; j++){
                char c = str.charAt(j);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
