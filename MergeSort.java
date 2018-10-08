import java.util.*;
	
public class MergeSort {

	public static void merge(int[] A, int p, int q, int r){
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for (int i=0;i < n1;i++) {
			L[i] = A[p+i];
		}
		for (int j=0;j < n2;j++) {
			R[j] = A[q+1+j];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for(int k = p; k <= r; k++){
			if(L[i] <= R[j]){
				A[k] = L[i];
				i += 1;
			}
			else{
				A[k] = R[j];
				j += 1;
			}
		}
	}

	public static void mergeSort(int[] A,int p,int r){
		if(p < r){
			int q = (p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the array elements");
		for (int i=0;i < n;i++) {
			a[i] = in.nextInt();
		}
		mergeSort(a,0,n-1);
		for (int i=0;i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}