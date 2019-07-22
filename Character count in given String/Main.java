#include<stdio.h>
#include<string.h>
int main()
{
    char str[21];
    int i,n,j,k,cnt=0;
    scanf("%s%n",str,&n);
  if(n>20)
  {
    printf("Invalid Input");
    return 0;
  }
    for(i=0;i<n;i++)
    {
        cnt=1;
        for(j=i+1;j<n;j++)
        {
              if(str[i]==str[j])
              {
                  cnt=cnt+1;
              }  
              else
              {
               
                  i=j-1;
                  break;
              } 
        }
        
        printf("%c%d",str[i],cnt);
        if(str[j] == '\0')
           break;
			
    }
 // printf("Invalid Input");
    return 0;
}