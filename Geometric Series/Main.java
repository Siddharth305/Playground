#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int a[1000],i,j=1,k=1,n;
  scanf("%d",&n);
  a[1]=1;
  a[2]=1;
  for(i=3;i<=1000;i++)
  {
    if(i%2!=0)
    {
      a[i]=pow(2,j);
      j++;
    }
    else 
    {
      a[i]=pow(3,k);
      k++;
    }
  }
  printf("%d",a[n]);
    
  
      return 0;
}