#include<iostream>
#include<bits/stdc++.h>
int main(){
	char* buffer=new char[8];
	memset(buffer,0,8);
	delete[] buffer;
	std::cin.get();
	return 0;
}
