//暴力解法
#include<iostream>
using namespace std;
int main()
{                   
    int m,n,max,min;
    cin>>m>>n;
    int p[100][100];                                       // p就是一个二维数组                      
    for (int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            cin>>p[i][j];                          // 赋值
    for (int i=0;i<m;i++)
    {   
        max=p[i][0];
        for (int j=1;j<n;j++)
            max=max<p[i][j]?p[i][j]:max;
        cout<<max<<" ";                            // 行最大
    }                                                     
    cout<<endl; 
    for (int j=0;j<n;j++)
    {   
        min=p[0][j];
        for (int i=1;i<m;i++)
            min=min>p[i][j]?p[i][j]:min;
        cout<<min<<" ";                            // 列最小
    }
    //system("pause");
    return 0;
}
// 二维指针法
/*
#include<iostream>
using namespace std;
int max(int *arr,int n);                           // 多余的最大值函数
int main()
{                   
    int m,n;
    cin>>m>>n;
    int **p;                                       // p就是一个二维数组
    p=new int *[m];                                // 行
    for (int i=0;i<m;i++)       
        p[i] = new int [n];                        // 列 
    for (int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            cin>>p[i][j];                          // 赋值
    for (int i=0;i<m;i++)
        cout<<max(p[i],n)<<" ";                    // 行最大
    cout<<endl; 
    for (int j=0;j<n;j++)
    {   
        int min=p[0][j];
        for (int i=1;i<m;i++)
            min=min>p[i][j]?p[i][j]:min;
        cout<<min<<" ";                            // 列最小
    }
    //system("pause");
    return 0;
}
int max(int *arr,int n)
{
    int max=arr[0];
    for (int i=0;i<n;i++)
    max = max<arr[i]?arr[i]:max;
    return max;
}*/