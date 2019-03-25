#include<iostream>
using namespace std;
int main(){
    int num,arr[50];
    int i;
    cin>>num;
    for(i=0;num!=0;num/=10)           // 将n的各位数字赋到数组中去
    {
        arr[i]=num%10;
        i++;
    }
    for(int j=0;j<i;j++)              // 冒泡排序
    {   
        int temp=arr[j];
        for(int k=i-1;k>j;k--)
        {
            if (temp>arr[k])
            {
                arr[j]=arr[k];
                arr[k]=temp;
                temp=arr[j];
            }
        }
    }
    for (int j=0;j<i;j++)             //输出去零
    {
        if (arr[j]==0)
           continue;
        else 
           cout<<arr[j];
    }
return 0; 
}