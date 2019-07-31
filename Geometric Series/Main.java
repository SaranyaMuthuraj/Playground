#include<stdio.h>
int main()
{
  int n,a,r,ts1,ts2,nt;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=1;r=2;
    ts1=(n+1)/2;
    nt= a * pow (r,ts1-1);
    printf("%d",nt);
  }
  else
  {
    a=1;r=3;
    ts2=n/2;
    nt= a * pow(r,ts2-1);
    printf("%d",nt);
  }
  return 0;
}