/*#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	cout<<oct;
	cout<<n;
	system("pause");
	return 0;
}
*/
#include<iostream>
using namespace std;
int main()
{
	int n,a[50],i=0;
	cin>>n;
	while (n!=0)
	{
		a[i++]=n%8;
		n/=8;
	}
	for (int j=i-1;j>=0;j--)
		cout<<a[j];
	system("pause");
	return 0;
}