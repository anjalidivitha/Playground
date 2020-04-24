#include <iostream>
#include<string.h>
using namespace std;
int main()
{
char str[100], rev[100];     
int len,i,j;    
cin.getline(str,100);
len=strlen(str);
for(i=len-1,j=0;i>=0,j<=len;i--,j++)
 rev[j]=str[i];
  
cout<<rev;
}