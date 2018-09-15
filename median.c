#include<stdio.h>
int main(int argc, char const *argv[])
{	
	int n;
	scanf("%d", &n);
	int median = 0;
	scanf("%d", &median);
	printf("%d\n", median);
	for (int i = 0; i < n - 1; ++i)
	{
		int num = 0;
		scanf("%d", &num);
		median = (median + num)/2;
		printf("%d\n", median);
	}
	return 0;
}