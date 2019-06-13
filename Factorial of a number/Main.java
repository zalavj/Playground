#include <stdio.h>
int main() {
int n,i;
  int fact =1;
 scanf("%d",&n);
  for (i=1;i<=n;i++)
  {
     fact=i*fact;
    
  }
  printf("%d",fact);
  return 0;
}
