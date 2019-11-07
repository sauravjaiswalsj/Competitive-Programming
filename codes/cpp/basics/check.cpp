#include<iostream>
#include<string.h>
int main(){
	std::string sr;
	std::getline(std::cin , sr);
	int i=0,sum=0;
	while(sr[i]!='\0'){
		if(sr[i]>='0' && sr[i]<='9'){
			sum+=(sr[i]-'0');
		}
	}
	std::cout<<sum;
}
