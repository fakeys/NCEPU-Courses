#include <iostream>
using namespace std;
int sum_fac(int n);
int main(){
    int a;
    cin>>a;
    if (a==sum_fac(sum_fac(a)))
    	cout<<sum_fac(a);
    else
    	cout<<"no";
    return 0;
}
int sum_fac(int n)
{   
	int sum(0);
	for(int k=1;k<n;k++)
       if(n%k==0)
          sum+=k;
    return sum;
}