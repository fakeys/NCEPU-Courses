#include<iostream>
#include<cstring>
#include<cctype>
using namespace std;
int main( ) 
{ 
	char a[100];
	cin>>a;
	int length=strlen(a);
	int chars=0,digits=0,others=0; 
	for (int i=0;i<length;i++)
	{
		if (isalpha(a[i]))
			chars++;
		else if (isdigit(a[i]))
			digits++;
		else others++;
	}
	cout<<chars<<" "<<digits<<" "<<others;
    return 0;
}