#include <stdio.h>

int main(){
  int value;
  int x, y, z;
  char stop;
  float avg;
  /* Get the inputs   */
  printf("enter the value of x:\n");
  scanf("%d", &x);
  printf("enter the value of y:\n");
  scanf("%d", &y);
  printf("enter the value of z:\n");
  scanf("%d", &z);

  /*while there is more input     */
  while(stop != EOF){
    /*calculate the average */
    avg = (x + y + z)/3.0;
    printf("Use command of EOF to exit.\n");
    stop = getchar();
    /*Get the next set of inputs   */
    printf("The avg now is %f.\n", avg);
    printf("Enter a number(use command of EOF to exit): \n");
    scanf("%d", &x);
    printf("Enter a number(use command of EOF to exit): \n");
    scanf("%d", &y);
    printf("Enter a number(use command of EOF to exit): \n");
    scanf("%d", &z);
  }
  /* print the results */
  printf("The avg is %f.\n", avg);
  return 0;
}
