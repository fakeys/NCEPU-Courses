#include <iostream>
using namespace std;
int main(){
	char five[5];
	int i(0);
	cin>>five;
	while(i<5){
	if (five[i]<'v')
		cout<<char(five[i]+4);
    else 
        {
            cout<<char(five[i]-22);}
	        i++;
        }
    /*char a,b,c,d,e;
    cin>>a>>b>>c>>d>>e;
    if (a<118)
    cout<<char(a+4);
    else cout<<char(a-22);
    if (b<118)
    cout<<char(b+4);
    else cout<<char(b-22);
    if (c<118)
    cout<<char(c+4);
    else cout<<char(c-22);
    if (d<118)
    cout<<char(d+4);
    else cout<<char(d-22);
    if (e<118)
    cout<<char(e+4);
    else cout<<char(e-22);*/
    return 0;
}