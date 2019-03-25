#include<iostream>
using namespace std;
int gcd(int x,int y);
int  main()
{
	int a,b,min,max;
	cin>>a>>b;
	min=gcd(a,b);
	max=a*b/min;                    // 最大公约数*最小公倍数 = a*b
	cout<<min<<" "<<max;
	return 0;
}
int gcd(int x,int y)                // greast common divisor最大公约数
{
	return y ? gcd(y,x%y) : x;
｝                                  // 用辗转相除法，逐次迭代