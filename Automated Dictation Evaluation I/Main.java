#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char str1[100],str2[100];
  int len1,len2,count=0,c;
  cin>>str1>>str2;
  len1=strlen(str1);
  len2=strlen(str2);
  if(len1==len2){
   c=strcmp(str1,str2);
  if(c!=0) {
   cout<<"It is wrong";
  }
    else { cout<<"It is correct"; }
  }
  else cout<<"It is wrong";
    return 0;
}