#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char a[50],b[50];
  int n,i,j=0,sum=0,len=0;
  scanf("%s",a);
len=strlen(a);
  for(i=len;i>=0;i--)
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
  i=0;
  while(sum!=0)
  {
    b[i]=sum%8;
    sum=sum/8;
    i++;
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%d",b[j]);
  }
  return 0;
}