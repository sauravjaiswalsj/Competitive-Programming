#include<bits/stdc++.h>

int main(){
	int n;
	std::cin>>n;
	int temp=n;
	do{
		std::cout<<n<<"a ";
		if(n>0){
			n=n-5;
			std::cout<<n<<"b ";
		}
		else{
			 std::cout<<n<<"c ";
			n=n+5;
		}
		if(n==temp){
			 std::cout<<n<<"d ";
 			 break;
		
		}
		std::cout<<n<<" ";
	}while(n==temp);
	return 0;
}
