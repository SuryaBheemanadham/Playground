#include <stdio.h>
int main() {
	int n,a,sum=0,k=0;
  scanf("%d",&n);
  sum+=n%10;
  while(n!=0)
  {
    a=n%10;
    n=n/10;
    k=k*10+a;
  }
  sum+=k%10;
  printf("%d",sum);
	return 0;
}