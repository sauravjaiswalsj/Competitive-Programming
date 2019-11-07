#include<iostream>

int main(int args,char** argv){
	std::cout<<"hello"<<std::endl;

	if(args!=1){
		std::cout<< " You passed"<<args<<" no of arguments"<<std::endl;
	}
	else{
		std::cout<<"You passed "<<args<<" no. of arguments"<<std::endl;
	}

	for(int i=0;i<args;i++){
		std::cout<<argv[i]<<std::endl;
	}
	std::cin.get();
	return 0;
		
