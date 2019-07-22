#include<stdio.h>
int main()
{
  //Type your code here
  int a=-1,b=1,c=0,n,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    a=b;
    b=c;
    printf("%d ",c);
    c=a+b;
  }
  return 0;
}