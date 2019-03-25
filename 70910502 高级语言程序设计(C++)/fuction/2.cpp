#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	double x,y;
	cin>>x;
	if (x<=0)
		y=sin(x)+1;
	else if (x<10)
	    y=x*x+3.0/x;
	else
		y=sqrt(x+4);
	cout<<y<<endl;
	return 0;
}