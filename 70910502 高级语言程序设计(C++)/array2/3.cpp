#include<iostream>
using namespace std;
int main()
{   
	int n=0,i;
	char array[100],a;
	cin>>array;
	cin>>a;
	for (i=0;i<100;i++)
		if (a==array[i])
		{
			n++;                           // 计数
			break;
		}
    if (n==0)
    	cout<<"no"<<endl;
    else
    	cout<<i<<endl;                     // 位置输出
    //system("pause");
    return 0;
}