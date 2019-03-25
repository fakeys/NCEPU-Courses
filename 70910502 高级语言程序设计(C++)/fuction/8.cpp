#include<iostream>
#include<cmath>
using namespace std;
int fun(int num);
int main()
{
	int num;
	cin>>num;
	cout<<fun(num);
	return 0;
}
int fun(int num)
{   
	int i=0;
	int temp=num;
	while(temp!=0)
	{
		temp/=10;
		i++;
	}
	if (i==1)
		return 0;
	else
		return num%(int(pow(10,i-1)));
}