#include<iostream>
#include<cmath>
using namespace std;
double fun(int k);
int main()
{
	int n;
	double sum=0.0;
	cin>>n;
	for (int i=1;i<=n;i++)
		sum+=fun(i);
	cout<<sum;
	return 0;
}
double fun(int k)
{
	return pow(-1,k+1)/k/(k+1);
}