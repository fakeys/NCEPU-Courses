//计算素数
#include <iostream>
#include <cmath>
using namespace std;
bool prime(int x)
{
    int y;
    if (x==1||x==0)
    return false;
    for (y = 2; y <= sqrt(x); y++)
        if (x % y == 0)
            return false;
    return true;
}
int main()
{
    int n, i;
    double sum(0.5);
    cin >> n;
    if (n >= 2)
        cout << 2 << " ";
    for (i = 3; i <= n; i++)
        if (prime(i))
            cout << i << " ";
    system("pause");
    return 0;
}
