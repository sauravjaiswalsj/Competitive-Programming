#include<iostream>
#include<limits>
int main(){
	//https://en.cppreference.com/w/cpp/types/numeric_limits
	//<int> is a template	:
	std::cout<<std::numeric_limits<int>::max()<<std::endl;
	return 0;
}
