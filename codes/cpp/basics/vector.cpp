#include<iostream>
#include<vector>
#include<bits/stdc++.h>
using std::cin;
using std::cout;
using std::vector;

int main(){
	vector<int> mylist;// = new vector<int>;
	for(int i=0;i<5;i++){
		cin>>mylist.at(i);
	}
	sort(mylist.begin(),mylist.end());
	for(int i=0;i<5;i++){
		cout<<mylist.at(i);
	}
	//delete mylist;
	return 0;
}
