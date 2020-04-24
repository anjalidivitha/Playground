#include<iostream>
using namespace std;
int main()
{
  int a[20],n,i,j,loc,val,temp;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(i=1;i<=n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>loc;
  if(loc>n)
    cout<<"Invalid Input";
  else{
  cout<<"Enter the value to insert\n";  
  cin>>val;
  a[n+1]=a[n];
  for(i=n;i>loc;i--)
  {
    a[i]=a[i-1];
  }
  a[loc]=val;
  cout<<"Array after insertion is\n";
  for(i=1;i<=n+1;i++)
    cout<<a[i]<<"\n";
  }  
}