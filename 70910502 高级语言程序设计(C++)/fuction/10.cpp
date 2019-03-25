#include<iostream>
using namespace std;
int fun(int *,int);
int main()
{
	int a[50],n,i,sum;
	cin>>n;
	for (int i=0;i<n;i++)
		cin>>a[i];
	sum=fun(a,n);
	for(i=0;i<n;i++)
		cout<<a[i]<<" ";
	cout<<endl<<sum<<endl;
	return 0;
}
int fun(int *arr,int n)
{   
	int sum=0,max(0),min(0),temp;
	int i, j;
    for (i = 0; i < n; i++)                         // 循环比较找最大数的下标
    {
        for (j = 1; j < n; j++)
            if (arr[i] < arr[j])
                break;
        if (j==n)
        {
            max = i;                                // 下标给max
            break;
        }
    }
    int a, b;
    for (a = 0; a < n; a++)                         // 同最大值，就是改了一个＞号
    {
        for (b = 1; b < n; b++)
            if (arr[a] > arr[b])
                break;
        if (b == n)
        {
            min = a;
            break;
        }
    }
    temp = arr[max];                      // 交换最值操作
    arr[max] = arr[min];
    arr[min] = temp;
   for (int k=0;k<n;k++)
   	   sum+=arr[k];
   	return sum;
}