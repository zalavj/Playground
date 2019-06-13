#include<stdio.h>
int main()
{
  int num,n1,n2,s;
  scanf("%d",&num);
  n1=num/10;
  n2=num%10;
  s=n1+n2;
  printf("%d",s); 
  return 0;
}