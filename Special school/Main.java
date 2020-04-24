#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str1[50],str2[50],i,j,c=0;
  int l1,l2;
  cin.getline(str1,50);cin.getline(str2,50);
  l1=strlen(str1);l2=strlen(str2);
  if(l1==l2)
  {
    for(i=0,j=l2-1;i<l1,j>=0;i++,j--)
    {
      if(str1[i]==str2[j])
        c++;
    }
    if(c==l1)
      cout<<"It is correct";
    else
      cout<<"It is wrong";
  }
  else
    cout<<"It is wrong";
}