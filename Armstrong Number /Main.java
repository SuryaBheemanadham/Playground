#include <stdio.h>
int main() {
	int n,i=0,j,sum=0,l,m,b,k;
  scanf("%d",&n);
  k=n;
  b=n;
  while(n!=0)
  {
    i++;
    n=n/10;
  }
  while(k!=0)
  {
    j=k%10;
    m=1;
    for(l=1;l<=i;l++)
    {
      m*=j;
    }
    k=k/10;
    sum+=m;
  }
  if(sum==b)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  
	return 0;
}