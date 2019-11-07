#include<iostream>
int add(int n){
	return n;
}
int add(int a,int b){
	return a+b;
}
int add(int a,int b,int c){
	return a+b+c;
}
int main(){
	std::cout<<add(2)<<std::endl;
	std::cout<<add(2,4)<<std::endl;
	std::cout<<add(2,3)<<std::endl;
}
