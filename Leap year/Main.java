#include<stdio.h>
int main()
{
  int year;
  scanf("%d",&year);
  if (year%400 == 0 || year%4 == 0 || year%100 == 0)
  {
    printf("Leap year\n");
  }
  else 
  {
	printf("Not Leap year");
  }
  return 0;
}