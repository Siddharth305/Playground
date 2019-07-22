#include<stdio.h>
int main()
{
  //Type your code here
  int a[50],i,j,x,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&x);
  for(i=1;i<=n;i++)
  {
    if(a[i]==x)
    {
      printf("%d",i);
      return 0;
    }
  }
  
  printf("%d isn't present in the array.",x);
  return 0;
}