#include <iostream>
#include <algorithm>
using namespace std;
int main(){
    int n;
    cin>>n;
    int *arr = new int[n+1];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    cin>>arr[n];
    /*for(int j=0;j<n;j++)              // 冒泡排序，就是用来排数组升序或降序的
    {                                 // 背下来，写成数组函数
        int temp=arr[j];
        for(int k=n;k>j;k--)
        {
            if (temp>arr[k])          // 这里的符号决定升序或降序
            {
                arr[j]=arr[k];
                arr[k]=temp;
                temp=arr[j];
            }
        }
    }*/
    sort(arr,arr+n+1);
    for (int j=0;j<=n;j++)
        cout<<arr[j]<<" ";
    delete arr;
    return 0;
}
