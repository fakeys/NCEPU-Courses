#include<iostream>
using namespace std;
int main()
{
	double sum(0),i(1.0),p;
	cin>>p;
	while (sum<=p)
	{
		sum+=(i+1)/i;
		i++;
	}
	cout<<sum;
	return 0;
}
