// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a,b,k,m;
  scanf("%d%d",&a,&b);
  if(a>b)
    m=b;
  else
    m=a;
  for(int i=m;i>0;i--){
    if(a%i==0&b%i==0)
    {k=i;
    break;}
  }
  printf("%d",k);
   return 0;
}