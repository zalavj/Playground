#include<stdio.h>
int main()
{
  //Type your code here
  int num1,f,s,t,sum;
  scanf("%d",&num1);
  f=num1/100;
  s=(num1%100)/10;
  t=num1%10;
  sum=f+t;
  printf("%d",sum);
  return 0;
}