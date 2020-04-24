#include<iostream>
using namespace std;
int main()
{
  int a[100][100],b[100][100],n,m,i,j;
  cin>>n>>m;
  for(i=0;i<n;i++)
  {for(j=0;j<m;j++)cin>>a[i][j];}
  for(i=0;i<n;i++)
  {for(j=0;j<m;j++)cin>>b[i][j];}
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      a[i][j]+=b[i][j];
      cout<<a[i][j]<<" ";
    }
    cout<<"\n";
  }
}