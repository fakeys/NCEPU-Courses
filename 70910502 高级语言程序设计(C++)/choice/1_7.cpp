#include<iostream>
using namespace std;
int main(){
    int x;
    cin>>x;
    if (x%7==0&&x%3==0)
    cout<<3;
    else if(x%7==0)
    cout<<"2";
    else if(x%3==0)
    cout<<"1";
    else cout<<"4";
    system("pause");
    return 0;
}