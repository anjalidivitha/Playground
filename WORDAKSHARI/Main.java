#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[50],str2[50];
  int l;
  cin>>str1;
  cout<<str1<<"\n";
  while(1)
  {
    strcpy(str2,str1);
    l=strlen(str2);
    cin>>str1;
    if(strcmp(str1,"####")==0)
      break;
    if(str2[l-1]!=str1[0])
      break;
    cout<<str1<<"\n";
  }
}