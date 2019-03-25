#include<iostream>
#include<cmath>
using namespace std;
bool prime(int x);
int main()
{
	int n;
	double sum=0.0;
    cin>>n;
	for (int i=2;i<=n;i++)
		if (prime(i))
			sum+=1.0/i;
	cout<<sum;
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
