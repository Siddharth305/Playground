// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  int a,b;
  scanf("%d %d",&a,&b);
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
  printf("%d",a);
  
   return 0;
}