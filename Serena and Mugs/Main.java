#include<iostream>
using namespace std;
int main()
{
  int n,s,a[100],cn=0,cy=0,i;
  cin>>n>>s;
  for(i=0;i<n;i++){
    cin>>a[i];
    if(n*a[i]>s)
      cn++;
    else
      cy++;
  }
  if(cy>0 && cn==0)
    cout<<"YES";
  else
    cout<<"NO";
}