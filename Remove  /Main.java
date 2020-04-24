#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  int l,i;
  getline(cin,str);
  /*l=str.size();
  for(i=0;i<l;i++)
  {
    if((str[i]==116 || str[i]==84) && str[i-1]==' ')
    {
      if(str[i+1]==104 && str[i+2]==101)
      {
        str.erase(i,3);
      }
    }
  }
  cout<<str;*/
  cout<<"remove occurrence of word from entered string";
}