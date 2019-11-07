#include<iostream>

int main(){
	int first_Variable{0}, second_Variable{0};

	std::cout<<"Enter the variable\n";

	std::cin>>first_Variable>>second_Variable;

	std::cout<<first_Variable+second_Variable<<'\n';
	std::cout<<first_Variable-second_Variable<<'\n';
	return 0;
}
