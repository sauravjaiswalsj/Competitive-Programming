#include<iostream>
#include<string>
#define String std::string
int main(){
	String a,b;
	std::getline(std::cin,a);
	std::getline(std::cin,b);
	String c=b.substr(0,1);
	c=c.append(a.substr(1,a.size()));
	std::cout<<a.size()<<" "<<b.size()<<"\n";
	std::cout<<a.append(b)<<"\n";
	std::cout<<c<<" "<<b.replace(0,1,a.substr(0,1));
	return 0;
}
