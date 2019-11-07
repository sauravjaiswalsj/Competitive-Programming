#include<iostream>
#include<string>
using namespace std;
int main(){
	int n;
	cin>>n;
	int marks[n];
	int group[10]={0};
	for(int i=0;i<n;i++){
		cin>>marks[i];
		++group[(int)(marks[i]/10)];
	}
	for(int i=0;i<10;i++){
		cout<<i<<" ";
		for(int j=0;j<group[i];j++){
			cout<<"*";
		}
		cout<<"\n";
	}
}
