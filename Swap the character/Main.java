#include<stdio.h>
#include<string.h>
int main()
{
  // type your code here
  char a[200],b[200],c[200];
 int i,j,len1=0,len2=0,len3=0;
  scanf("%s %s %s",a,b,c);
  len1=strlen(a);
  len2=strlen(b);
  len3=strlen(c);
  //printf("%d",len);
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' ||a[i]=='I' ||a[i]=='O' ||a[i]=='U')
    {
      printf("$");
    }
    else
    {
      printf("%c",a[i]);
    }
  }
  for(i=0;b[i]!='\0';i++)
  {
      if(b[i]=='a' || b[i]=='e' || b[i]=='i' || b[i]=='o' || b[i]=='u' || b[i]=='A' || b[i]=='E' ||b[i]=='I' ||b[i]=='O' ||b[i]=='U')
    {
      printf("%c",b[i]);
    }
    else
    {
      printf("#");
    }

  }
  for(i=0;c[i]!='\0';i++)
  {
      if(c[i]>=65 && c[i]<=90)
      {
        printf("%c",c[i]);
      }
      else if(c[i]>=97 && c[i]<=122)
        {
            printf("%c",c[i]-32);
        }
  }
  return 0;
}
//FoCuS
