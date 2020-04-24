#include<iostream>
using namespace std;
int main()
{
  int a[100],n,i,oddc=0,evenc=0;
  cout<<"Enter the number of elements in the array";cin>>n;
  cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++)
  { 
    cin>>a[i];
    if(a[i]%2==0)
      evenc++;
    else
      oddc++;
  }
  if(evenc>0 && oddc>0)
    cout<<"\nThe array is Mixed";
  else if(evenc>0 && oddc==0)
    cout<<"\nThe array is Even";
  else
    cout<<"\nThe array is Odd";
  
}