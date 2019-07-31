#include<stdio.h>
int main()
{
  int a,b,hcf,lcm,i;
  scanf("%d%d",&a,&b);
  i=(a>b) ? b : a;
  for( ;i>=1;i--)
  {
    if(a%i==0 && b%i==0)
    {
      hcf=i;
      break;
    }
  }
  lcm=(a*b)/hcf;
  printf("%d",lcm);
  return 0;
}