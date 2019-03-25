#include<iostream>
using namespace std;
int main()
{
    int n,a,b,c;
    cin>>n;
    if (n>=100&&n<=999)
    {
        for (int i=100;i<=n;i++)
        {
            a=i/100;
            b=i/10%10;
            c=i%10;
            if (a*a*a+b*b*b+c*c*c==i)
                cout<<i<<" ";
        }
    }
    system("pause");
    return 0;
}