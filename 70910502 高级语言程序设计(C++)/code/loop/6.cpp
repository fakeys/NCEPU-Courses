#include<iostream>
#include<cmath>
using namespace std;
int main(){
	double e,sum(0);
	cin>>e;
	for(int i=1,k=0;1.0/i>e;i+=4,k++)
		sum+=pow(-1,k)*1.0/i;            // 这题可能结果错误会是硬件问题，换台电脑试试
	cout<<s;
	return 0;
}