#include<iostream>
int main(){
	int n;
	std::cin>>n;
	int sum=0;
	for(int i=2;i<=n;i++){
		if(i & 1 !=0)
			continue;
		else{
			sum+=i*i;
		}
	}
	std::cout<<sum;
	return 0;
}
	

