#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here       
  int a,b,res;
  scanf("%d %d",&a,&b);
  if(b<0)
  {
    printf("Wrong input");
  }
  else
  {
    res=pow(a,b);
    printf("%d",res);
  }
  return 0;
}