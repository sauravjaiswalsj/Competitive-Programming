#include<iostream>
#include<string>
int main(){
	std::string a;
	std::string b;
	std::getline(std::cin, a);
	std::getline(std::cin,b);
	if(b.find(a)){
		std::cout<<"b in a"<<std::endl;
	}
	else{
		std::cout<<"not found"<<std::endl;
	}
}
