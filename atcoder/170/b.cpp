#include<bits/stdc++.h>

using namespace std;

int main(){
	int x,y;
	cin>>x>>y;
	if(y<=4*x && y%2==0){
		cout<<"Yes\n";
	}
	else{
		cout<<"No\n";
	}
	return 0;
}
