#include<iostream>
using namespace std;
int main(){
    int x,y,z,max;
    cin>>x>>y>>z;
    max=x>y?x:y;
    max=max>z?max:z;
    cout<<max;
    return 0;
    system("pause");
}