#include<iostream>
using namespace std;
bool fun(int x){
	int t=x;
    if (t%7==0)
        return true;
    else 
        return false;
    while(x%10!=0)
    {
        if(x%10==7)
            return true;
        else 
            x/=10;
    }
}
int main()
{
    int n,sum(0);
    cin>>n;
    for(int i(1);i<=n;i++)
    {
        if(!fun(i))
            sum+=i*i;
    }
    cout<<sum;
    return 0;
}
