//输出一个数的所有因子
#include <iostream>
using namespace std;
int main(){
    int n;
    cout << "Enter a positive number: ";
    cin >> n;
    cout << "Number " << n <<" Factors: ";
    for(int k=1;k<=n;k++)
     if(n%k==0)
      cout << k << " ";
    cout << endl;
    system("pause");
    return 0;
}