#include<stdio.h>
int main()
{
  int n,i,s;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&s);
  for(i=0;i<n;i++)
  {
    if(arr[i]==s)
    {
      printf("%d",i+1);
      return 0;
    }
   }
  printf("%d isn't present in the array.",s);
  return 0;
  }