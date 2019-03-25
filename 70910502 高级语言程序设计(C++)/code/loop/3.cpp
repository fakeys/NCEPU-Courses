#include<iostream>
using namespace std;
int main(){
    int min,n,a,i(0);
    int ch[50];
    cin>>n;
    a=n;
    while (a>0)
    {                       // 求出的i是几，就是几位数
        a/=10;
        i++;
    }
    //int *ch=new int[i];              // 这是[]里是变量的定义方式
    for(int b(0);b<i;b++)
    {                                  // 这个循环将各位数字赋给数组
       ch[b]=n%10;
       n/=10;
    }
    min=ch[0];                         // 同第二题循环取最小
    for(int c(1);c<i;c++)
       min=min>ch[c]?ch[c]:min;
    cout<<min;
    return 0;
}