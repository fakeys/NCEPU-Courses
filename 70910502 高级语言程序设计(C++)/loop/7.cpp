#include<iostream>
using namespace std;
int main(){
	char c;
	int sum(0);
    while(cin>>c&&c!='0')             // 就酱
	sum+=c;                           // 字符自动转换为整形ASC码运算
	cout<<sum;
	return 0;
}