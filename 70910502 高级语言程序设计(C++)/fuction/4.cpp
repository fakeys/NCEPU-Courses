#include<iostream>
#include<cmath>
using namespace std;
int digit(int num,int k);
int main()
{
	int num,k;
	cin>>num>>k;
	cout<<digit(num,k);
	return 0;
}
int digit(int num,int k)
{
	int i(0),p;
	int temp=num;
	while(temp!=0){
		temp/=10;
		i++;
	}
	if (i<k)
		return 0;
	else
	{   
		p=int(pow(10,k-1));
	    return (num/p)%10;
    }
}
