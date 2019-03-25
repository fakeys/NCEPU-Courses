#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
    int n,arr[50];
    cin>>n;
    for(int i=0;i<n;i++)
    cin>>arr[i];
    sort(arr,arr+n);
    cout<<arr[0];
    system("pause");
    return 0;
}