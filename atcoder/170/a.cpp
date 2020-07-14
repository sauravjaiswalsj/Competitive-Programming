#include<bits/stdc++.h>

using std::cin;
using std::vector;
using std::cout;

#define fa for(int i=0;i<5;i++)
int main(){
	int a;
	vector<int> arr;
	bool x=false;
	fa{
		cin>>a;
		arr.push_back(a);
	}
	fa{
		if(arr[i]==0){
			cout<<i+1;
			x=true;
		}
	}
	if(x==false){
		cout<<0;
	}
	return 0;
}	
