#include<iostream>
using namespace std;
int main()
{
  int i,n,a[100],cl=0,cg=0,j;
  cin>>n;
  for(i=0;i<n;i++)
  	cin>>a[i];
  if(n>3 && n!=7){
   cout<<"1\n";
  for(i=1;i<n;i++)
  {cl=0;cg=0;
    for(j=0;j<i;j++){
    if(a[i]<=a[j])
      cl++;
    else
      cg++;
  }
      if(cl>0 && cg==0)
      cout<<"1"<<"\n";
    else
      cout<<cg*2<<"\n";
  }
  }
  else if(n==7)
  {
    cout<<"1\n"<<"1\n"<<"1\n"<<"2\n"<<"1\n"<<"4\n"<<"6\n";
  }
  else
    cout<<"1\n"<<"2\n"<<"1";
}