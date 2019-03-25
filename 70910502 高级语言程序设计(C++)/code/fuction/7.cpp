#include<iostream>
using namespace std;
int comb(int x,int y);
int main()
{
	int x,y;
	cin>>x>>y;
	cout<<comb(x,y);
	return 0;
}
int comb(int x,int y)
{
	int a,b,c,d;
	a=x/10;
	b=x%10;
	c=y/10;
	d=y%10;
	return 1000*a+100*c+10*d+b;
}