#include <stdio.h>
int main() {
	int n,i,m=1;
  scanf("%d",&n);
  if(n==0)
    printf("1");
  else
  {
  for(i=1;i<=n;i++){
    m*=i;}
  }
  printf("%d",m);
    
	return 0;
}