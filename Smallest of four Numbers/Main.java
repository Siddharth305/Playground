#include<stdio.h>

int main()
{
  // Type your code here
  int a,b,c,d,max;
  scanf("%d %d %d %d",&a,&b,&c,&d);
  if(a<b && a<c && a<d)
  {
    printf("%d",a);
  }
  else if(b<a && b<c && b<d)
  {
      printf("%d",b);
    }
 else if(c<a && c<b && c<d)
  {    
   printf("%d",c);
  }
  else
  {
    printf("%d",d);
  }
  return 0;
}