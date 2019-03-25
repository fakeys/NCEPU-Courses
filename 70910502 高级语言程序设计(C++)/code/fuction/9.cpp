#include<iostream>
#include<cstring>
using namespace std;
int search(char *,int,char);
int main()
{
	char a[100];
	cin>>a;
	int length=strlen(a);
	cout<<search(a,length,'1')<<" "
	    <<search(a,length,'2')<<" "
        <<search(a,length,'3')<<endl;
    return 0;
}
int search(char *a,int length,char ch)
{   
	int counts=0;
	for (int i=0;i<length;i++)
		if (a[i]==ch)
			counts++;
	return counts;
}
