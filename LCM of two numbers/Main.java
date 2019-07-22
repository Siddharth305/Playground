#include<stdio.h>
int main()
{
  //Type your code here
  
  int a,b,lcm,x,y,gcd;
  scanf("%d %d",&a,&b);
   x=a;
  y=b;
  while(a!=b)
  {
    if(a>b)
    {
      a=a-b;
    }
    else
    {
      b=b-a;
    }
  }
 
 
  lcm=(x*y)/a;
  printf("%d",lcm);
  return 0;
}