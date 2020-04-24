#include<iostream>
using namespace std;
int main()
{
  int a[100][100],n,m,i,j,lar;
  cin>>n>>m;
  for(i=0;i<n;i++)
  {for(j=0;j<m;j++)cin>>a[i][j];}
  for(j=0;j<m;j++)
  {
    lar=a[0][j];
    for(i=0;i<n;i++)
    {
     if(a[i][j]>lar)
       lar=a[i][j];
    }
    cout<<lar<<"\n";
  }

}