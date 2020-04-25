#include<bits/stdc++.h>
static int summ=0;
static int id=0;
int sum(int array[],int n){
	if(id>n){
		return 0;
	}
	id++;
	std::cout<<summ<<" ";
	summ=summ+array[id];
	sum(array,n);
	return summ;
}
int main(){
	int n;
	std::cin>>n;
	int *arr= new int[n];
	for(int i=0;i<n;i++){
		std::cin>>arr[i];
	}
	std::cout<<sum(arr,n);
}
