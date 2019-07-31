#include<stdio.h>

int main()
{
  char str[100],s;
  int i,w=0;
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
    {
      w++;
    }
  }
    w++;
    printf("%d",w);
    return 0;
}