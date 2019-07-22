#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
float opp,adj,res;
  scanf("%f %f",&opp,&adj);
  res=sqrt((opp*opp)+(adj*adj));
  printf("%.2f",res);
  return 0;
}