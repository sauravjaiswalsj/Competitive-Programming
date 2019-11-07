#include<iostream>
int main(){
	int n,k=1;
	std::cin>>n;
	for(int i=1;i<=n;i++){
		for(int j=n;j>=i;j--){
			std::cout<<" ";
		}
		for(;k<=i;k++){
			std::cout<<k;
		}
		/*
		for(int l=k-1;l>=i;--l){
			std::cout<<l;
		}*/
		std::cout<<"\n";
	}

}
