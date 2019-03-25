#include<iostream>
#include<cmath>
using namespace std;
bool prime(int x);
int main()
{
	int x;
	cin>>x;
	for (int i=2;i<x/2;i++)
		if (prime(i)&&prime(x-i))
		{
			cout<<x<<"="<<i<<"+"<<x-i;
			break;
		}
    return 0;
}
bool prime(int x)
{
    int y;
    if (x==1||x==0)
    return false;
    for (y = 2; y <= sqrt(x); y++)
        if (x % y == 0)
            return false;
    return true;
}
