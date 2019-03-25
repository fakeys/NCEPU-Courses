#include<iostream>
#include<cmath>
#include<algorithm>
using namespace std;
bool prime(int x);                            // 很熟悉的素数函数
int main(){
    int num1,sum(0),j=0;
    cin>>num1;
    int arr1[50],arr2[50];
    for (int i=0;i<num1;i++)
        cin>>arr1[i];
    for (int i=0;i<num1;i++)
        if (prime(arr1[i])){
            sum+=arr1[i];                     // 素数求和
            arr2[j]=arr1[i];                  // 将素数放到一个数组
            j++;
        }
    sort(arr2,arr2+j);                     // sort 排序大法好
    cout<<sum<<endl;
    for (int i=j-1;i>=0;i--)               //逆序输出
        cout<<arr2[i]<<" ";
    return 0;    
}
bool prime(int x)
{   
    if (x==1||x==0)
        return false;
    int y;
    for (y = 2; y <= sqrt(x); y++)
        if (x % y == 0)
            return false;
    return true;
}