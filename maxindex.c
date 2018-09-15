#include <stdio.h>
int main(int argc, char const *argv[])
{
	int t;
	scanf("%d", &t);
	for(int j = 0; j < t; j++){
		int n;
		scanf("%d", &n);
		int a[n];
		for (int i = 0; i < n; ++i){
			scanf("%d", &a[i]);
		}
		int diff = 0, max = 0;
		for (int i = 0; i < n - 1; i++)	{
			for (int j = n - 1; j > i; j--){
				if(a[i] <= a[j]){
					diff = j - i;
					if(diff > max)
						max = diff;
				}
			}
		}
		printf("%d\n", max);
	}
	return 0;
}