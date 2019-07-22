#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,c,pos,neg,det=0;
  scanf("%f %f %f",&a,&b,&c);
  det=((b*b)-(4*a*c));
  if(det > 0)
  {
    pos=((-b)+(sqrt(det)))/(2*a);
    neg=((-b)-(sqrt(det)))/(2*a);
    printf("root1 = %.2f  root2 = %.2f",floor(pos),floor(neg));
  }
  else if(det == 0)
  {
    pos=(-b/(2*a));
    //neg=(-b)/(2*a);
    printf("root1 = %.2f  root2 = %.2f",floor(pos),floor(pos));
  }
  else
  {
    pos=(-b/(2*a));
    neg=sqrt(-det)/(2*a);
  printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",pos,neg,pos,neg);
  }
  
            return 0;
}