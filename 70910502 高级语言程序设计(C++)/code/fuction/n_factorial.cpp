//n的阶乘
#include<iostream>
using namespace std;
int fac(int x);
int main(){
    int i;
    cin>>i;
    cout<<fac(i);
    system("pause");
    return 0;
}
int fac(int x){
    /*int val(1);
    while(x>0){
        val*=x;
        x-=1;
        return val;
    }*/
    int f;
    if(x==0)
    f=1;
    else
    f=fac(x-1)*x; 
    return f;
}