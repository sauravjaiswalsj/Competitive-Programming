/*
 * pass 1 - 1 2 3 4 5
 * pass 2 - 1 2 3 4 5
 * pass 3 - 1 2 3 4 5
 * till n
 * *
 */
#include<iostream>
int main(){
	int n;
	std::cin>>n;
	for(int i=1;i<=n;i++){
		std::cout<<"Pass "<<i<<" - ";
		for(int j=1;j<=n;++j){
			std::cout<<j<<" ";
		}
		std::cout<<"\n";
	}
}
