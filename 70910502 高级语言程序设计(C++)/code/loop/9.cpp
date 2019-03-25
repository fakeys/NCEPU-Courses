#include<iostream>
#include<cmath>
using namespace std;
int main(){
	int n;
	long money1,money2;
	cin>>n;
	money1=pow(2,n)-1;           // 直接用等比数列求和公式，循什么环
	money2=(1e+5)*n;
	cout<<money2<<endl;
	cout<<money1;
	return 0;
}

