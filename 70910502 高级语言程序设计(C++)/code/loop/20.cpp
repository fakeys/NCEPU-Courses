#include<iostream>
#include<cmath>
using namespace std;
int main(){                                   // 等差数列求和公式sum=n*first+n*(n-1)/2，公差是1
	int sum,first;                            // 第一项first，和是sum
	int i,j;                                  // 想到应该是连续的n个数相加，n必须是整数
	int a,b,c;                                // 将公式变形，n*n+(2*first-1)*n-2*sum=0
	cin>>sum;                                 // 用求根公式表示n=(1-2*first+sqrt(△))/2
	for(i=1;i<=sum/2;i++){                    // 从1开始循环找首项，首项必然小于sum/2，不然和后项一相加就大于sum
		first=i;                             
		a=(2*first-1)*(2*first-1)+8*sum;      // a=△求和公式根号内的内容
		b=(int)sqrt(a);                       // 取根号，并转换为整形，a是整数，则精度不会丢失
		c=b-2*first+1;                        // a不是整数，精度丢失
		if(b*b!=a)                            // 这种情况下sqrt求出小数，那么个数n必然不是整数，回头重来
			continue;
		else if(c%2!=0)                       // 看求和公式，如果不是2的倍数，那么n也是小数，回头重来
			continue;
		else                                  // 剩下的就是成立的首项
		{
		  for (j=1;j<=c/2;j++)                // c/2就是之前强调的个数n
		       cout<<i+j-1<<" ";
		  cout<<endl;
		}
	}
	return 0;
}
