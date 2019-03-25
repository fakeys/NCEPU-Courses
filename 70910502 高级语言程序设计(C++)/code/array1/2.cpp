#include <iostream>
using namespace std;
int main()
{
    int n,arr[100];
    int max, min, temp;
    cin >> n;
    for (int i = 0; i < n; i++)                     // 输入数组
        cin >> arr[i];
    int i, j;
    for (i = 0; i < n; i++)                         // 循环比较找最大数的下标
    {
        for (j = 1; j < n; j++)
            if (arr[i] < arr[j])
                break;
        if (j == n)
        {
            max = i;                                // 下标给max
            break;
        }
    }
    int a, b;
    for (a = 0; a < n; a++)                         // 同最大值，就是改了一个＞号
    {
        for (b = 1; b < n; b++)
        {
            if (arr[a] > arr[b])
            {
                break;
            }
        }
        if (b == n)
        {
            min = a;
            break;
        }
    }
    temp = arr[max];                      // 交换最值操作
    arr[max] = arr[min];
    arr[min] = temp;
    for (int p = 0; p < n; p++)
        cout << arr[p] << " ";
    return 0;
}