#include<iostream>
using namespace std;
int main()
{
  int a[100][100],n,m,i,j,sr=0;
  cin>>n>>m;
  for(i=0;i<n;i++)
  {sr=0;
    for(j=0;j<m;j++)
    {
    cin>>a[i][j];sr+=a[i][j];
    }
    cout<<sr<<"\n";
    
  }
  
}