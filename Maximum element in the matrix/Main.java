#include<iostream>
using namespace std;
int main()
{
  int a[100][100],i,j,lar,n,m;
  cin>>n>>m;
  for(i=0;i<n;i++)
  {for(j=0;j<m;j++)cin>>a[i][j];}
  lar=a[0][0];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(a[i][j]>lar)
        lar=a[i][j];
    }
  }
  cout<<"The maximum element is "<<lar;
}