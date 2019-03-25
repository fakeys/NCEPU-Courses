#include<iostream>
using namespace std;
int *swap(int* ,int );                   // 再次定义一个数组函数，不过与上一题不一样
int main(){
    int n,arr[50],temp;
    cin>>n;
    for(int i=0;i<n;i++)
    cin>>arr[i];
    swap(arr,n);
    for(int i=0;i<n;i++)
    cout<<arr[i]<<" ";
    return 0;
}
int *swap(int *arr,int Length)
{
    int i,temp;
    for(i=0;i<Length/2;i++)              // 前一半变到后一半
    {
        temp=arr[i];
        arr[i]=arr[Length-i-1];
        arr[Length-i-1]=temp;
    }
    return arr;
}