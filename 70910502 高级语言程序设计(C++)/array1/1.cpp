#include <iostream>
using namespace std;
int main()
{
    int m, n,num = 0;
    cin >> n;
    int arr1[100],arr2[100],arr3[100];                   
    for (int i = 0; i < n; i++)             // 为数组赋值
        cin >> arr1[i];
    cin >> m;                                    
    for (int i = 0; i < m; i++)
        cin >> arr2[i];                
    for (int i = 0; i < n; i++)             // 遍历循环找相同元素
    {                                       // 第一个数组的第一个数与第二个数组每一个比较
        for (int j = 0; j < m; j++)         // 第一个数组的第二个数与第二个数组每一个比较
        {                                   // ......两次循环
            if (arr1[i] == arr2[j])
            {
                arr3[num] = arr1[i];          // 重复的数字赋给第三个数组
                num++;                        // num是个数
            }
        }
    }
    if (num == 0)                             // 个数为0
        cout << "no";
    else
    {                            
        int i, j;
        for (i = 0; i < num; i++)
        {
            for (j = i+1; j < num; j++)
                if (arr3[i] == arr3[j])     // 排除arr3中的重复数字
                    break;
            if (j == i)                     // 只输出每个数字出现的第一次
                cout << arr3[i] << " ";
        }
    }
    return 0;
}
