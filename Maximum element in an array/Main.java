#include<stdio.h>
int main()
{
  	//type your code here
  int a[50],i,n,max=-100;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    if(a[i]>max)
    {
      max=a[i];
    }
  }
printf("%d",max);
  return 0;
}