#include <iostream>
#include <cstring>
using namespace std;
int main(){
	char a[100];
	int i(0);
	cin>>a;
    int length=strlen(a);
	while(i<length){
	if (a[i]<'V')
		cout<<char(a[i]+4);
    else if (a[i]<='Z') 
        cout<<char(a[i]-22);
    else if (a[i]<'v')
    	cout<<char(a[i]+4);
    else
    	cout<<char(a[i]-22);
	i++;
    }
    return 0;
}