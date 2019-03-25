#include <iostream>
using namespace std;
bool fun(int n);
int main()
{
	int n;
	cin>>n;
	for(int i=1;i<=n;i++)  
		if (fun(i))
			cout<<i<<" ";
	return 0;
}
bool fun(int n)
{
	int s(0);
	for(int k=1;k<n;k++)
	if(n%k==0)            // 循环加因子
	    s+=k;             // 用s表示因子之和
	if (s==n)
		return true;
    else 
	 	return false;
}