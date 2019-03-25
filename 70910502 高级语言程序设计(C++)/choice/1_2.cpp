#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	double x;
	cin>>x;
	if (x<=-1)
		cout<<3*sqrt(2-x)+1;
	else if (x>10)
		cout<<sqrt((x+1)/(2*x*x));
	else
		cout<<pow(x,5)+1;
	system("pause");
	return 0;
}