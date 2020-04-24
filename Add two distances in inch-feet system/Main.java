#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  float i1,i2,f1,f2,sumi=0,sumf=0;cin>>i1>>f1>>i2>>f2;
  sumi=i1+i2;
  sumf=f1+f2;
  if(sumf>10){
  if(sumf<13)
  {
    sumi++;
    sumf=sumf-(int)sumf;
  }
  else
  {
    sumi++;
    sumf=sumf-12.0;
  }}
  cout<<sumi<<"'-"<<setprecision(2)<<sumf;
  cout<<'"';
  
}