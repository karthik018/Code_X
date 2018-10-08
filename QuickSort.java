import java.util.*;
public class QuickSort {

    public static int partition(int[] a, int p, int q){
    	int v = a[p];
    	int i = p + 1;
    	int t = 0;
    	for(int j = p + 1; j <= q; j++){
    	    if(a[j] < v){
        		t = a[i];
        		a[i] = a[j];
        		a[j] = t;
        		i += 1;00
    	    }
    	}
    	t = a[p];
    	a[p] = a[i - 1];
    	a[i - 1] = t;
    	return i - 1;
    }

    public static void quickSort(int[] a, int p, int q){
    	if(p < q){
  	    int j = partition(a,p,q);
  	    quickSort(a, p, j-1);
  	    quickSort(a, j+1, q);
    	}
    }

    public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++)
    		a[i] = in.nextInt();
    	quickSort(a,0,n-1);
    	for(int i = 0; i < n; i++){
    	    System.out.print(a[i] + " ");
    	}
    	System.out.println();
    }
}
