#include<iostream>
using namespace std;
int fac(int x);
int main()
{
    int x;
    int sum(0);
    cin>>x;
    for(int i=1;i<=x;i++)
        sum+=fac(i);
    cout<<sum;
    return 0;
}
int fac(int x)               // 阶乘函数，理解或者背代码
{
    int f;
    if(x==0)
    f=1;
    else
    f=fac(x-1)*x;            // 一个迭代，建议逐步调试来观察运行顺序
    return f;
}