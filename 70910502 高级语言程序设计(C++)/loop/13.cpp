#include <iostream>
#include <cmath>
using namespace std;
bool prime(int);
int main()
{
	int m,n,count=0;
	double sum=0.0;
	cin>>m>>n;
	for (int i=m;i<=n;i++)
		if (prime(i))
		{
			sum+=i;
			count++;
		}
	if (count==0)
		cout<<"no";
	else
		cout<<count<<" "<<sum/count;
	system("pause");
	return 0;
}
bool prime(int x)                   // 这个代码可背
{
    int y;
    if (x==1||x==0)
    return false;
    for (y = 2; y <= sqrt(x); y++)
        if (x % y == 0)
            return false;
    return true;
}