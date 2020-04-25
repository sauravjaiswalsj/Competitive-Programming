#include<iostream>
int counter=0;
int count(int n) 
{
	if(n==0)
		return 1;
	count(n/10);
	std::cout<<n<<" ";
	++counter;
	std::cout<<std::endl;
	return counter;
}
int main(){
	int n;
	std::cin>>n;
	std::cout<<count(n);
}
