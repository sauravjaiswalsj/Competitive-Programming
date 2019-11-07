#include<iostream>
#include<math.h>
int main(){
	int n,sum=0,i=0;
	std::cin>>n;
	while(n!=0){
		int r=n%10;
		sum+=r*pow(2,i);
		n/=10;
		i++;
	}
	std::cout<<sum;
}
