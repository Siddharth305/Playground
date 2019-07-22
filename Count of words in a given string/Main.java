#include<stdio.h>

int main()
{
  //Type your code here
  char a[25];
  int i,count=0;
  scanf("%[^\n]s",a);
  for(i=0;a[i]>='\0';i++)
  {
    if(a[i]==' ')
    {
      count++;
    }
    }
  printf("%d",count+1);
  return 0;
}