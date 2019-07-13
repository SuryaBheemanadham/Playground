#include<stdio.h>
int main()
{
	int n,e=-2,o=-1,s;
  scanf("%d",&n);
  for(int i=1;i<=n;i++){
    if(i%2==1){
      e+=2;
      s=e;}
    else
    {o+=1;
     s=o;}
  }
  printf("%d",s);
}