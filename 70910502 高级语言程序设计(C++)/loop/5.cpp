#include<iostream>
using namespace std;
int main(){
	int a,n,b,sum(0);
	cin>>a>>n;
	b=a;
	for (int i = 1; i <=n; i++)
	{   sum+=b;
		b=b*10+a;          //a+aa+aaa++aaaa......的循环算法
    }
	cout<<sum;
	return 0;
}
