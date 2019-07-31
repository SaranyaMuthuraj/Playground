#include<stdio.h>
int main()
{
  int n,a,d,ts1,ts2,nt;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    ts1=(n+1)/2;
    nt=a+(ts1-1)*d;
    printf("%d",nt);
  }
  else
  { 
    a=0,d=1;
    ts2=n/2;
    nt=a+(ts2-1)*d;
    printf("%d",nt);
   }
return 0;
}