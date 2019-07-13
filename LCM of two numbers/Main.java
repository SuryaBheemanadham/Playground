#include<stdio.h>
int main()
{
  int a,b,lcm,gcd,n;
  scanf("%d%d",&a,&b);
  if(a<b)
    n=a;
  else
    n=b;
  for(int i=n;i>0;i--){
    if(a%i==0&b%i==0){
      gcd=i;
      break;}
  }
  lcm=(a*b)/gcd;
  printf("%d",lcm);
  return 0;
}