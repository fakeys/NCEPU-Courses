#include <iostream>
#include <cmath>
using namespace std;
bool prime(int x)                   // 直接复制13题的素数函数
{
    if (x==1||x==0)
        return false;
    int y;
    for(y=2;y<=sqrt(x);y++)
        if (x%y==0)
	       return false;
	return true;
}
int main ()
{
    int n,i;
	double sum(0.5);
    cin>>n;
	if (n==2)
		cout<<sum;
    for(i=3;i<=n;i++)
        {
            if (prime(i))
		    sum+=1.0/i;
        }
	cout<<sum;
    return 0;
}
