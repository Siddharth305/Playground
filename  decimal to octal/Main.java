#include<stdio.h>
int main()
{
  //Type your code here
  int a[50],n,i=0,j,sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
    a[i]=n%8;
    i++;
    n=n/8;
    
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%d",a[j]);
  }
  return 0;
}