#include<stdio.h>
#include<math.h>
int main()
{
float pi=3.14,result, r,ang;
  scanf("%f %f",&r,&ang);
  result=(2*pi*r)*(ang/360);
  printf("%.2f",result);
  return 0;
}