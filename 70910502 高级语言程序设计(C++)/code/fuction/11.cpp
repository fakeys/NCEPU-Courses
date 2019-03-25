#include<iostream>
#include<cmath>
#include<algorithm>
using namespace std;
bool prime(int x);
//int *bubblesort(int *arr,int length);
int main()
{
	int n,j(0),arr1[100],arr2[100];
	cin>>n;
	for (int i=0;i<n;i++)
		cin>>arr1[i];
	for (int i=0;i<n;i++)
		if (prime(arr1[i]))
		{
			arr2[j]=arr1[i];
			j++;
		}
    sort(arr2,arr2+j);
	//bubblesort(arr2,j);
	for (int i=0;i<j;i++)
	cout<<arr2[i]<<" ";
	return 0;   
}
bool prime(int x)
{
    int y;
    if (x==1||x==0)
    return false;
    for (y = 2; y <= sqrt(x); y++)
        if (x % y == 0)
            return false;
    return true;
}
/*int *bubblesort(int *arr,int length)
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
                temp=arr[i];
            }
        }
    }
return arr;
}*/