#include<iostream>
#include<string.h>
int main(){
	std::string str;
	std::getline(std::cin,str);
//	str.erase(str.begin());
//	str.pop_back();
	//str.substr(1,str.size()-2);
	std::cout<<str.substr(1,str.size()-2);
}

