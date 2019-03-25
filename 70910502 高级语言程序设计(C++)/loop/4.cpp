#include<iostream>
using namespace std;
int fib(int n);                             // 声明一个斐波拉契函数，经常用到，写成函数，随时复制粘贴
int main(){
       int n;
	   double sum(0);
       cin>>n;
	   int *p=new int[n];                   // 用变量定义，简单程序这样就好了，以后复杂程序还有进一步的操作
	   int *q=new int[n];                   // 暂时还是推荐用长度为100或50的数组
	   for(int i=0;i<n;i++){
		   p[i]=fib(i+3);
		   q[i]=fib(i+2);
		   sum+=(double(p[i])/q[i]);}
	   cout<<sum;
return 0;
}
int fib(int n){
    if(n<3)                                // 这里可根据题目的要求稍作修改
		return (1);
	else
	  return (fib(n-1)+fib(n-2));
}
	
