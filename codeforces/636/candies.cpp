#include<bits/stdc++.h>

void findX(int n){
	double x;
	for(int k=1;k<=n;k++){
		double p=pow(2,k);
		x=n*((1-k)/(1-p));
		std::cout<<x<<" ";
	}
	
	//std::cout<<x<<"\n";
}
int main(void){
	int t,n;
	std::cin>>t;
	while(t!=0){
		std::cin>>n;
		findX(n);
		t--;	
	}
	return 0;
}
