#include<iostream>
int main(){
	int nr;
	std::cin>>nr;
	int row=1;
	int nst=nr;
	for(int i=1;i<=nr;i++){
		for(int j=1;j<=nr;j++){
			if(i==j || ((i==nst || j==nst) && nst!=(nr/2)+1)){
				std::cout<<"*";
			}else{
				std::cout<<" ";
			}
		}
		std::cout<<std::endl;
		nst--;
	}
}	
