#include<iostream>

using namespace std;

int main(){
	int n,count=0;
	cin>>n;
	int arr[n],arr1[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}
	for(int i=0;i<n;i++){
		cin>>arr1[i];
	}
	for(int i=0;i<n;i++){
		if(arr[0]==arr1[i]){
			count=i;
		}
	}
	cout<<count;
}
