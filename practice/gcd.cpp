#include<iostream>
int gcd(int a,int b){
	if(b==0){
		return a;
	}
	int p=a%b;
	return gcd(b,p);
}
int main(void){
	int a,b;
	std::cin>>a>>b;
	std::cout<<gcd(a,b);
}
