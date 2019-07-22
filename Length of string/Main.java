#include<stdio.h>
int main()
{
  //Type your code here
  char a[50],i,count=0;
  scanf("%[^\n]s",a);
  for(i=0;a[i]!='\0';i++)
  {
    count++;
  }
  printf("%d",count);
  return 0;
}