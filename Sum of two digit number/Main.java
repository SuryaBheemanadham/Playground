#include<stdio.h>
int main()
{int n,a;
  scanf("%d",&n);
 a=n%10;
 n=n/10;
 printf("%d",a+n);
  return 0;
}