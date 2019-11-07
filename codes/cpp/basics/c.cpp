#include<iostream>
int main(void){
	int e;
	char c='a';
	int t=(int)c-2;
	std::cout<<t;
	if(t<97){
		std::cout<<t;
		e=122-2;
	}
	char d=(char)e;
   	std::cout<<d;
}
