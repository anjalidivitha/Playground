#include<iostream>
#include<string>
using namespace std;
int main()
{
  int i;
  string str;getline(cin,str);
  for(i=0;i<str.size();i++)
  {
    if((str[i]<'A' || str[i]>'Z') && (str[i]<'a' || str[i]>'z'))
    {str.erase(i,1);i--;}
  }
  cout<<str;
}