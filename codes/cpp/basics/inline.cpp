#include<iostream>
#define SQR(x) x*x
inline int sqr(int n){
	return n*n;
}
int main(){
	int n;
	std::cin>>n;
	int num=n;
	std::cout<<sqr(++n);
	std::cout<<"\nDefine"<<SQR(++num);
}
