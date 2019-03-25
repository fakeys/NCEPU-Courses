#include<iostream>                      // 这么直白的题还用什么数组
using namespace std;
int fib(int);
int main()
{
    int n,sum(0);
    cin>>n;
    for (int i=1;i<=n;i++)
    sum+=fib(i);
    cout<<sum;
    return 0;
}
int fib(int n)                         // 再次斐波拉契数列
{
    if(n==1||n==2)
    	return 1;
    return fib(n-1)+fib(n-2);
}