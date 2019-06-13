#include <stdio.h>
int main() {
  int n,i,odd=1;
  scanf("%d",&n);
  for (i=1;i<=n;i++)
  {
    printf("%d\n",odd);
    odd=odd+2;
  }
  return 0;
}