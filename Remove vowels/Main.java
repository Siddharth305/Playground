#include<stdio.h>
int main()
{
  char str[100];
  int i;
  scanf("%[^\n]s", str);
  
  //Type your code here
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
    {
      continue;
    }
    else
    {
      printf("%c",str[i]);
    }
  }
  
  return 0;
}