#include<stdio.h>
int main()
{
  int n,i,ele1,ele2,ele1_ix=-1,ele2_ix=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&ele1,&ele2);
  for(i=0;i<n;i++)
  {
    if(ele1==a[i] && ele1_ix==-1)
    {
      ele1_ix=i;
    }
    if(ele2==a[i] && ele2_ix==-1)
    {
      ele2_ix=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",ele1_ix,ele2_ix);
  return 0;
}