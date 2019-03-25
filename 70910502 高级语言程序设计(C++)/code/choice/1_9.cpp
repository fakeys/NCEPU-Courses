#include<iostream>
using namespace std;
int main(){
    unsigned i,m(0);
    cin>>i;
    if (i<99||i>999)
    cout<<"-1";
    else {while(i>0){
      m=m*10+i%10;
      i/=10;       
    }
    cout<<m;}
    system("pause");
    return 0;
}