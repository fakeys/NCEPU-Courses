#include<iostream>
using namespace std;
int main(){
	int n,i(0);
	double sum(0),ave;
	int arr[100];
	while(true){
       cin>>arr[i];
	   if (arr[i]>0)
	   {
		   sum+=arr[i];
	       i++;
		}
		else 
		   break;
	}
	ave=sum/i;
	cout<<ave<<endl;
	for (int j=0;j<n;j++)
	{
		if (ave>arr[j])
		cout<<arr[j]<<" ";
    }
	return 0;
}


	 