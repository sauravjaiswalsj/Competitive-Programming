#include<iostream>
int main(void){
	int n;
	std::cin>>n;
	int nsp=n-1;
	int nst=1;
	int row=1;
	while(row<=n){
		int csp=1;
		while(csp<=nsp){
			std::cout<<" ";
			csp++;
		}
		int cst=1;
		while(cst<=nst){
			std::cout<<"1";
			cst++;
		}
		//prep
		std::cout<<std::endl;
		nst+=2;
		nsp--;
		row++;
	}
}
