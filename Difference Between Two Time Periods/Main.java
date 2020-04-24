#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int h1,h2,m1,m2,s1,s2;
  cin>>h1>>m1>>s1>>h2>>m2>>s2;
  if(s2>s1) {
      m1--;  s1+= 60;
  }
   if(m2>m1) {
      h1--; m1+= 60;
   }
   cout<<h1-h2<<":"<<m1-m2<<":"<<s1-s2;
  return 0;
}