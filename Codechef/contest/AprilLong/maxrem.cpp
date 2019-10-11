#include<iostream>
#include <bits/stdc++.h> 
int main(void){
	int n;
	std::cin>>n;
	int arr[n];
	for(int i=0;i<n;i++){
		std::cin>>arr[i];
	}
	std::sort(arr,arr+n);
	int j=arr[n-1],max=0,mod;
	try{
	for(int i=0;i<n;i++){
		if(arr[i]==0)
			throw arr[i];
		mod=arr[i]%j;
		if(mod>=max){
			max=mod;
		}
	}
	std::cout<<max;
	}
	catch(int x){
		std::cout<<max;
	}
}

	
