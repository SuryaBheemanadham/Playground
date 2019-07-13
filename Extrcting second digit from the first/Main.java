#include <stdio.h>
int main() {
	int n,a,k=0;
  scanf("%d",&n);
  while(n>0){
    a=n%10;
    n=n/10;
    k=k*10+a;
  }
  printf("%d",(k/10)%10);
	return 0;
}