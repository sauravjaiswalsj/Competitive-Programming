#include<iostream>
int gcd(int max, int min){
	int hcf=max%min;
	while(hcf!=0){
		max=min;
		min=hcf;
		hcf=max%min;
	}
	return min;
}
int main(){
	int a,b;
	std::cin>>a>>b;
	std::cout<<gcd((a>b?a:b),(a<b?a:b));
	return 0;
}
