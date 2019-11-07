#include<iostream>
#include<string>
int main(){
	char c[20];
	std::cin.getline(c,20);
//	std::cin.ignore();
	int i=0;
	while(c[i]!='\0'){
	if((int)c[i] >=65 && (int)c[i]<=91){
		std::cout<<(char)((int)c[i]+32);
	}
	i++;
	}
	std::cin.get();
}
