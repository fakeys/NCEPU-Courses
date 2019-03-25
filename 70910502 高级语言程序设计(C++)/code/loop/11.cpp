#include<iostream>
using namespace std;
int main()
{
    int n;
    double x,s(1),ch;
    cin>>n>>x;
    ch=x;
    for(int i=1;i<=n;)
    {
	    s+=x;
        i++;
        x=(-1)*x*ch/i;
    }
    cout<<s;
    return 0;
}