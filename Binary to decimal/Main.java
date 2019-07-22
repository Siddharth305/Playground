#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
int main()
{
  //Type your code here
  char a[50];
  int len=0,i,j=0,sum=0;
  scanf("%s",a);
  len=strlen(a);
  for(i=(len-1);i>=0;i--)
  {
    if(a[i]=='1')
    {
     sum+=pow(2,j);
      j++;
    }    
    else if(a[i]=='0')
    {
    j++;
 	 }
  }
  printf("%d",sum);
  return 0;
}