/*
given price of burger, can of soda and a combo meal.
to compute the fixed price.

*/
#include<iostream>
using namespace std;
int main(){
	long int t,b,s,c,sum;
	cin>>t;
	while(t!=0){
	cin>>b>>s>>c;
	sum=(b+s)-c;
	cout<<sum<<endl;
	t--;
	} 
return 0;
}
