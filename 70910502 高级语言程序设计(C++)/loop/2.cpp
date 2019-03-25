#include<iostream>
using namespace std;
int main()
{
    int n,min;
	cin>>n;                      // 如果定义arr[n]会导致错误，因为[]内n必须是常量
	int arr[50];                 // 存储n个数字，（网站测试的n不会太大，所以定义长度50，100也没问题）
		for(int i(0);i<n;i++)    // 只给前n个赋值
		cin>>arr[i];
		min=arr[0];              // 先给min赋值
		for(int i(1);i<n;i++)    // 循环不断取最小值
			if(min>arr[i])
				min=arr[i];
		cout<<min;
		return 0;
	}




