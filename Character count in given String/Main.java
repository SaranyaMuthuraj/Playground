#include<stdio.h>
int main()
{
	char a[50];
  int len,i,c=1;
  scanf("%s",a);
  for(len=0;a[len]!='\0';len++);
  if(len>20)
  {
    printf("Invalid Input");
  }
  else
  {
    for(i=0;i<len;i++)
    {
      if(a[i]==a[i+1])
      {
        c++;
      }
      else
      {
        printf("%c%d",a[i],c);
        c=1;
      }
    }
  }
  return 0;
}