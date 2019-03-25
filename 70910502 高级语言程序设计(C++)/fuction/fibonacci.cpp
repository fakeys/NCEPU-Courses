//斐波拉契数列
#include<iostream>
using namespace std;
int fib(int n);
int main(){
	int n;
	cin>>n;
	cout<<fib(n);
	return 0;
}
int fib(int n){
    if(n<3)
		return (1);
	else
	  return (fib(n-1)+fib(n-2));
}
	