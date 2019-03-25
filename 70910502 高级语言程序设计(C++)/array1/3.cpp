#include<iostream> 
#include<algorithm>                               // 快排
using namespace std;                              // 快排和冒泡排序2选1
//int *bubblesort(int *arr,int length);           // 冒泡排序函数
int main()
{
    int arr[100],num[100];                      // num数组用来统计重复的次数
	int n;
	cin>>n;
	for (int i=0;i<n;i++)
		cin>>arr[i];                            // 输入数组 0 -50 0 632 5813 -50 9 -50 0 632
	for (int i=0;i<n;i++)
        num[i]=1;
    sort(arr,arr+n);                             // 不想背冒泡排序，就用这个快排
	//bubblesort(arr,n);                          // 将整个数组从小到大排列 -50 -50 -50 0 0 0 9 632 632 5813
	for (int i=0;i<n;i++)   
        for (int j=n-1;j>i;j--)                 // j>i是保证，只统计每个数字后面的重复次数 
            if (arr[i]==arr[j])                 // 这样，-50 -50 -50 0 0 0 9 632 632 5813 这样它对应的下标num[i]分别为
                num[i]++;                       //        3    2   1 3 2 1 1 2    1   1  
	for (int i=0;i<n;i++)   
    {
		int j;                         
        for (j=n-1;j>=0;j--)                    // num数组
            if (num[i]<num[j])                  // 将第一个数与后面每一个比较，如果不是最大的，就break
                break;
        if (j<0)                                // 如果一直没有break，说明它最大 
        {                           
            cout<<arr[i]<<" ";                  // 输出它
            cout<<num[i]<<endl;            
        }
    }
    return 0;        
}
/*int *bubblesort(int *arr,int length)            // 强烈建议背冒泡排序代码
{
    int i,j,temp;
    for(i=0;i<length-1;i++)
    {
        temp=arr[i];
        for (j=length-1;j>i;j--)
        {
            if (temp>arr[j])
            {
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
return arr;
}
*/