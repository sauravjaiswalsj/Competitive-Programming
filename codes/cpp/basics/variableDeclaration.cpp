#include<iostream>

using namespace std;

int main(){

	// Uniform Initialisation of variable
	int width{ 5 };
	cout<<width<<endl;

	//direct initialisation of variable
	int x(4);
	cout<<x<<endl;
	
	//copy of the value to decalred variable in the memory
	//This is also called as Copy assignment
	int y=9;
	cout<<y<<endl;

	int z{};
	cout<<z<<endl;
	cin.get();
	return 0;
}
