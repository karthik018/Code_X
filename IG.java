// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int length = A.length;
        int count = 1;
        boolean hill = false, valley = false;
        for(int i = 1; i < length; i++){
            if(A[i] > A[i-1]){
                hill = true;
                if(valley == true){
                    count++;
                    valley = false;
                }
            }
            else if(A[i] < A[i-1]){
                valley = true;
                if(hill == true){
                    count++;
                    hill = false;
                }
            }
        }
        if(hill == true || valley == true)
            count++;
        return count;
    }
}


// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    private ArrayList<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();
    public int solution(int[] A) {
        // write your code in Java SE 8
        int v = A.length, max = 0, num = 0;
        for(int i = 0; i < v; i++){
            list.add(new LinkedList<Integer>());
        }
        for(int i = 0; i < v; i++){
            list.get(i).add(A[i]);
            list.get(A[i]).add(i);
        }
        boolean[] visit = new boolean[v];
        for(int i = 0; i < v; i++){
            if(visit[i] == false){
                num = beads(i, visit);
            }
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public int beads(int node, boolean[] visit){
        int count = 1;
        visit[node] = true;
        for(Integer i : list.get(node)){
            if(visit[i] == false){
                count += beads(i, visit);
            }
        }
        return count;
    }
}
