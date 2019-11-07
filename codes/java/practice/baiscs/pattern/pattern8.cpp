#include<iostream>
int main(void){
	int nr;
	std::cin>>nr;
	int row=1;
	int nst=1;
	int nsp=nr/2;
	while(row<=nr){
		int csp=1;
		while(csp<=nsp){
			std::cout<<" ";
			csp++;
		}
		int cst=1;
		while(cst<=nst){
			std::cout<<"*";
			cst++;
		}
		//prep
		std::cout<<std::endl;
		if(row<=nr/2){
			nsp--;
			nst+=2;
		}else{
			nsp++;
			nst-=2;
		}
		row++;
	}
}
