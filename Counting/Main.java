#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int l,v=0,c=0,ws=0,d=0,s=0;
  char str[200];
  cin.getline(str,200);
  l=strlen(str);
  for(int i=0;i<l;i++)
  {
    if(str[i]=='a' || str[i]=='A' || str[i]=='e' || str[i]=='E' || str[i]=='i' || str[i]=='I' || str[i]=='o' || str[i]=='O' || str[i]=='u' || str[i]=='U')
           v++;
    else if(str[i]>='0' && str[i]<='9')
           d++;
    else if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
           c++;
    else if(str[i]==' ')
            ws++;
    else
        s++;
  
  }   
      
      cout<<"Vowels:"<<v;
      cout<<"\nConsonants:"<<c;
       cout<<"\nWhite Spaces:"<<ws;
            cout<<"\nDigits:"<<d;
            cout<<"\nSymbols:"<<s;
}




