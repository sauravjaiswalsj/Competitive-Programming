#include<iostream>
#include<string.h>
#include<bits/stdc++.h>
int main(){
	std::string str;
	//std::gets(str);
	std::getline(std::cin,str);
	//std::cout<<str;
	//std::cin.ignore();
	
	int i=0,count=0;
	while(str[i]!='\0'){
		if((int)str[i]>=97 && (int)str[i]<=122){
			count++;
		}
	}
	//printf("%d\n",INT_MAX);
	std::cout<<count;
	return 0;
}

