#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int t,k,year[100],i=1,temp,final;
  float per[100];
  string name[100],city[100];
  cout<<"Enter the number of colleges"<<endl; cin>>t;
  temp=t; final=t;
  for(k=1;k<=final;k++){
  cout<<"Enter the details of college "<<k<<endl;
   cout<<"Enter name "<<endl; cin>>name[k];
    cout<<"Enter city "<<endl; cin>>city[k];
    cout<<"Enter year of establishment "<<endl; cin>>year[k];
    cout<<"Enter pass percentage "<<endl; cin>>per[k];
  }
   cout<<"Details of colleges"<<endl;
  i=1;
  for(k=1;k<=final;k++){
    
  cout<<"College:"<<k<<endl;
    cout<<"Name:"<<name[k]<<endl;
    cout<<"City:"<<city[k]<<endl;
    cout<<"Year of establishment:"<<year[k]<<endl;
    cout<<"Pass percentage:"<<per[k]<<endl;
  }
  return 0;
}