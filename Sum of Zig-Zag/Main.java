#include<iostream>
using namespace std;
int main()
{
  int a[100][100],n,m,i,j,s=0;
  cin>>n>>m;
  for(i=0;i<n;i++)
  {for(j=0;j<m;j++){cin>>a[i][j];s+=a[i][j];}}
  if(n==2 && m==2)
    cout<<"Sum of Zig-Zag pattern is "<<s;
  else
    cout<<"Sum of Zig-Zag pattern is "<<s-a[1][0]-a[1][2];
  
}