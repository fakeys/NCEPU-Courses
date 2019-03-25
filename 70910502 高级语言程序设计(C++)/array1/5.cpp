#include<iostream>
using namespace std;
int *swap(int *,int);                 // 定义一个交换数组函数
int main(){
    int n,arr[50];
    cin>>n;
    for (int i=0;i<n;i++)
        cin>>arr[i];
    swap(arr,n);                       // 在此数组变了
    for (int i=0;i<n;i++)
    cout<<arr[i]<<" ";
    return 0;
}
int *swap(int *arr,int length)              // 十分简单的排序
{
    int temp = arr[0];
    for (int i=0;i<length;i++)
        arr[i]=arr[i+1];
    arr[length-1]=temp;
    return arr;                        // 返回值是一个变换后的数组
}

