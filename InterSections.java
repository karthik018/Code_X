import java.io.*;
import java.util.*;
public class InterSections{
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new File("interception.txt"));
            FileOutputStream out = new FileOutputStream("output2.txt");
            System.setOut(new PrintStream(out));
            int t = in.nextInt();
            for(int i = 0; i < t; i++){
                int n = in.nextInt();
                int[] coeff = new int[n+1];
                for(int j = 0; j < n+1; j++){
                    coeff[j] = in.nextInt();
                }
                System.out.print("Case #" + (i+1) + ": ");
                if(n % 2 == 0){
                    System.out.println(0);
                }
                else{
                    System.out.println(1);
                    System.out.println(0.0);
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
