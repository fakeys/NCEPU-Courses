#include<iostream>
#include<cstring>
using namespace std;
int main( ) 
{ 
	char a[100],b[100]; int i,length=0; 
    cin>>a; 
    length=strlen(a); 
    for(i=0;i<length;i++) 
        b[i]=a[length-i-1]; 
    b[i]='\0'; 
    strcat(a,b); 
    cout<<a; 
    return 0; 
}