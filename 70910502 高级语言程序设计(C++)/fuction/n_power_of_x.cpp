//x的n次方
#include <iostream>
using namespace std;
double power(double x, int n){
    double val =1.0;
    while (n--)
         val *=x;
    return val;
}
int main(){
    double pow,x;
    int y;
    cin >> x >> y;
	pow=power(x,y);
	cout << x << " to the power " << y << " is "<< pow<<endl;
	system("pause");
    return 0;
}
