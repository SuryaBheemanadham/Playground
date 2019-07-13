#include<iostream>
#include<bits/stdc++.h> 
#define pi 3.14
using namespace std;
int main(){
  float r,a;
  cin>>r>>a;
  a/=360.0;
  cout<<fixed<<setprecision(2)<<(2*pi*r)*a;
  return 0;
}