#include<iostream> 
#include<cmath> 
using namespace std;
int main() 
{
	int i=0; 
    char c1[100],c2[100]; 
    cin>>c1;
    cin>>c2; 
    while((c1[i]!='\0')&&(c2[i]!='\0')) 
    { 
        if (c1[i]==c2[i])
            i++; 
        else 
         	break; 
    } 
   	cout<<abs(c1[i]-c2[i]); 
    return 0; 
}