#include<iostream>
using namespace std;
int main(){
    char ch;
    cout << "Enter charecter:";
    cin >> ch;
    if(ch>='a' && ch<='z')
        cout << ch << " is a small case charecter.";//if user enter a small case charecter
    else if(ch>='A' && ch<='Z')
        cout << ch << " is a upper case letter.";//if user enter a upper case charecter
    else if(ch>='0' && ch<='9')
        cout << ch << " is a number"; //If user enter a number 
}