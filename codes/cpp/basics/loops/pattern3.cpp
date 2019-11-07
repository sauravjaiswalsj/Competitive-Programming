#include<iostream>
int main(){
	int n;
	std::cin>>n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			std::cout<<(char)(64+j);
		}
		std::cout<<std::endl;
	}
	
}
