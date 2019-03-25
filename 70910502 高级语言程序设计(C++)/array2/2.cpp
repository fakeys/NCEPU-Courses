//直接复制第一道题代码加以修改
#include<iostream>
using namespace std;                        
int main()
{                   
    int m,n;
    int sum = 0;                    // row是行，col（column）是列
    cin>>m>>n;
    int p[50][50];                       
    for (int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            cin>>p[i][j];                          // 赋值
    for (int i=0;i<m;i++)
    {   
        int sum_row=0;
        for (int j=0;j<n;j++)   
            sum_row+=p[i][j];
        cout<<sum_row<<" ";                        // 行和
    }
    cout<<endl; 
    for (int j=0;j<n;j++)
    {   
        int sum_col=0;
        for (int i=0;i<m;i++)   
            sum_col+=p[i][j];
        cout<<sum_col<<" ";                        // 列和 
    }
    cout<<endl;
    for (int i=0;i<m;i++)
        for (int j=0;j<n;j++)   
            sum+=p[i][j];                          // 全和
    cout<<sum;
    //system("pause");
    return 0;
}