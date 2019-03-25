#include<iostream>
using namespace std;
int main(){
    int n,num,first,last,mid,i(1);          // 用first last mid表示第一个数，最后一个数，中间数可以说很人性化了
    int arr[100]
    cin>>n;
    for (int i=0;i<n;i++)
        cin>>arr[i];
    cin>>num;
    first=0;
    last=n-1;
    while (first<=last)
    {
        mid=(first+last)/2;
        if(arr[mid]==num)                    // 判断是否等于中间数
        {
            cout<<mid<<endl;
            cout<<i;
            break;
        }
        else     
            if (arr[mid]<num)                // 比中间数大
                first=mid+1;                 // 所以把范围缩小到大的那一半
            else  
                last=mid-1;
        i++;
    }
    if (first>last)
    {
    	cout<<"no"<<endl;
        cout<<i-1; 
    }
    return 0; 
}