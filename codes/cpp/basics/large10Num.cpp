#include<iostream>
int main(){
	int n;int l=0;
	for(int i=1;i<=10;i++){
		std::cin>>n;
		l=n>l?n:l;
		std::cout<<l<<std::endl;
	}
	return 0;
}
