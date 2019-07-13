#include <stdio.h>
int main() {
int n,m,i,j,k,sum=0;
  scanf("%d",&n);
  m=n;
  while(n!=0)
  {
    i=n%10;
    n=n/10;
    k=1;
    if(i==0)
      sum+=1;
    else
    {
     for(j=1;j<=i;j++){
     k*=j;}
      sum+=k;
    }
  }
  if(sum==m)
    printf("Yes");
  else
    printf("No");
       
	return 0;
}