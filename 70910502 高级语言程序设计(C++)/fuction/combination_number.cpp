//计算C（n，k）组合数；
#include<iostream>
using namespace std;
int com(int n,int k);
int main(){
    int n,k;
    cin>>n>>k;
    cout<<com(n,k);
    system("pause");
    return 0;
}
int com(int n,int k){
    if(k>n)
    return 0;
    else if(k==n||k==0)
    return 1;
    else 
    return com(n-1,k)+com(n-1,k-1);//递归函数
}