#include<iostream>
int main(void){
	int nr;
	std::cin>>nr;
	int row=1;
	int nst=1;
	int nsp=2*nr-3;
	while(row<nr){
		int cst=1;
		while(cst<=nst){
			std::cout<<"*\t";
			cst++;
		}
		int csp=1;
		while(csp<=nsp){
			std::cout<<"\t";
			csp++;
		}
		int csd=1;
		while(csd<=nst){
			std::cout<<"*\t";
			csd++;
		}
		//prep
		std::cout<<std::endl;
		nst++;
		nsp-=2;
		row++;
	}
}
