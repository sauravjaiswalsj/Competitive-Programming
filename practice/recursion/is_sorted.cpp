#include<bits/stdc++.h>
int id=1;
bool is_sorted(int *arr ,int size){
	if(id>size){
		return false;
	}
	if(arr[id-1]>arr[id]){return false;}
	id++;
	is_sorted(arr,size);
	return true;
}
int main(){
	int n;
	std::cin>>n;
	int *arr=new int[n];
	for(int i=0;i<n;i++){
		std::cin>>arr[i];
	}
	std::cout<<is_sorted(arr,n);
}
