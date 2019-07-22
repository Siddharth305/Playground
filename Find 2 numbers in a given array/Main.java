#include<stdio.h>
int main()
{
  int a[50],i,j,m=0,k=0,n,first,second;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d %d",&first,&second);
    for(i=1;i<=n;i++)
  {
      if(a[i]==first)
      {
        m=i;
      }
       if(a[i]==second)
      {
        k=i;
      }
      
  }
  printf("Element 1 index = %d\nElement 2 index = %d",m-1,k-1);
  return 0;
}