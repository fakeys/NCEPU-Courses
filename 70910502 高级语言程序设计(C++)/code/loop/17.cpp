#include<iostream>
using namespace std;
int fac(int x){             // 复制的阶乘函数
    if(x==0)
        return 1;
    else
        return fac(x-1)*x; 
}
int sumf(int x){ 
    int s(0),i;
    while(x!=0){           // 求各位数字，就是%，/的搭配使用
        i=x%10;
        x/=10;
        s+=fac(i);
        }
        return s;
}
int main(){
    int x;
    cin>>x;
    cout<<sumf(x)<<endl;
    if(sumf(x)==x)
        cout<<"yes";
    else 
        cout<<"no";
    return 0;
}