#include <bits/stdc++.h>
using namespace std;
long int power(int n,int m){
  if(m==0)
    return 1;
  else
    return n*power(n,m-1);
}
int main()
{int n,m;
 cin>>n>>m;
 if(m>=0)
 cout<<power(n,m);
 else
   cout<<"Wrong input";
    return 0;
}