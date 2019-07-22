#include<stdio.h>
int main()
{
	//your code here
  long int i,fact=1,n;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    fact*=i;
  }
  printf("%ld",fact);
}