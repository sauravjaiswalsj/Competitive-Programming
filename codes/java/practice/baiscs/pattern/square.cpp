#include<iostream>
int main(){
	int nr;
	std::cin>>nr;
	int row=1;
	int nst=nr;
	while(row<=nr){
		int cst=1;
		while(cst<=nst){
			if(row==1 || row ==nr || cst == 1 || cst == nr){
				std::cout<<"*";
			}
			else{
				std::cout<<" ";
			}
			cst++;
		}
		std::cout<<std::endl
		row++;

	}

}
