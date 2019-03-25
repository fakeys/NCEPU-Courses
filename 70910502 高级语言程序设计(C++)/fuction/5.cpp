#include<iostream>
using namespace std;
int gcd(int x,int y);
int  main(){
	int a,b,min,max;
	cin>>a>>b;
	min=gcd(a,b);
	max=a*b/min;
	cout<<min<<" "<<max;
	return 0;
}
int gcd(int x,int y)
{return y ? gcd(y,x%y) : x;}