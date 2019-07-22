#include<stdio.h>
int main()
{
//type your code here
  int i,j,n,sum=0,sum1=0;
  scanf("%d",&n);
  
  int a[1000];
 // a[1]=0;
  //a[2]=0;
  for(i=1;i<=n;i++)
  {
     if(i%2==0)
     {
       a[i]=sum;
       sum=sum+1;
       
     }
    else //if(i%2!=0)
    {
       a[i]=sum1;
 sum1=sum1+2;
     
    }
}
  printf("%d",a[n]);
}