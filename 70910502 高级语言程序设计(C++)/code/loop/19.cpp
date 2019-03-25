#include<iostream>
using namespace std;
int gcd(int x,int y)                // 12题的函数
{return y ? gcd(y,x%y) : x;}
int main()
{
    unsigned int a,b;
    cin>>a>>b;
    if(a<b)
        cout<<a/gcd(a,b)<<" "<<b/gcd(a,b);
    return 0;
}

