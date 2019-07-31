#include <stdio.h>
int main()
{
	int i=365,d=4,q,r;
  q=i/d;
	r=i%d;
  printf("Quotient: %d\n",q);
  printf("Remainder: %d",r);
	return 0;
}
