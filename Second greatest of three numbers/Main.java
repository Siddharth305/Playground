#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c,max=0;
  scanf("%d %d %d",&a,&b,&c);
  if(a>b && a>c)
  {
   if(b>c)
   {
     printf("%d",b);
   }
    else
    {
      printf("%d",c);
    }
  }
   else if(b>a && b>c)
  {
   if(a>c)
   {
     printf("%d",a);
   }
    else
    {
      printf("%d",c);
    }
  }
    else
  {
   if(a>b)
   {
     printf("%d",a);
   }
    else
    {
      printf("%d",b);
    }
  }
  return 0;
}