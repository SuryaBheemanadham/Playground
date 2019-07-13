#include<bits/stdc++.h>
#define s(x) x*x
using namespace std;
int main(){
  float o,a,h,b;
  cin>>o>>a;
  b=s(o)+s(a);
  h=sqrt(b);
  cout<<fixed<<setprecision(2)<<h;
}