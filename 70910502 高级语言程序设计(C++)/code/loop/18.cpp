#include<iostream>
using namespace std;
int main(){
	int n,a(1),b(2);
	cin>>n;
	if(n>99&&n<1000)
	for(;b<=9;b++)
	{
	    for(;a<b;a++)
	    {
		    if((a*10+b)*(a+10*b)==n)
            cout<<a*10+b;
	    }
	    a=1;
	}
	return 0;
}



	