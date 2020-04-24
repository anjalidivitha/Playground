#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   struct student s;
  cin.getline(s.name,50);
  cin>>s.roll>>s.marks;
  cout<<endl<<"Student Details"<<endl;
  cout<<"Name: "<<s.name<<endl<<"Roll: "<<s.roll<<endl<<"Marks: "<<s.marks;
  return 0;
}