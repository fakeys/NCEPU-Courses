#include<iostream>
using namespace std;
int main(){
    int flower,a,b,c;
    cin>>flower;
    a=flower%10;
    b=flower/10%10;
    c=flower/100;
    if (flower<99||flower>999)
    cout<<"NO";
    else if(flower==a*a*a+b*b*b+c*c*c)
    cout<<"YES";
    else cout<<"NO";
    system("pause");
    return 0;
}