#include<iostream>
#include<cmath>
using namespace std;
int main(){
    double x,y;
    cin>>x;
    if (x<=-1)
    cout<<2*x+cos(x);
    else 
    if(x>=1)
       { 
            y=sin(x);
            cout<<pow(y,2);
       }
    else
        {
            y=pow(x+1,2.0/3);
            cout<<1.0/y;
        }
    system("pause")
    return 0;
}