#include<stdio.h>
int main()
{
  int n,a=0,b=1,c;
  scanf("%d",&n);
  if(n<=2){
  if(n==1)
    printf("0 ");
  else if(n==2)
    printf("0 1 ");
  }
  else{
    printf("0 1 ");
    for(int i=2;i<n;i++){
      c=a+b;
      a=b;
      b=c;
      printf("%d ",c);
    }
  }
  
  return 0;
}