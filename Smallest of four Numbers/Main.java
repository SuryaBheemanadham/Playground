#include<stdio.h>

int main()
{int a,b,c,d,t1,t2;
  scanf("%d%d%d%d",&a,&b,&c,&d);
 if(a<=b)
   t1=a;
 else
   t1=b;
 if(c<=d)
   t2=c;
 else
   t2=d;
 if(t1<=t2)
   printf("%d",t1);
 else
   printf("%d",t2);
}