#include<iostream>
bool leapyr(int yr){
	if(((yr%4==0)||(yr%400==0))&&(yr%100!=0)){
		return true;
	}
	else{
		return false;
	}
}
int main(){
	int yr;
	std::cin>>yr;
	if(leapyr(yr)){
		std::cout<<"Leap Year";
	}else{
		std::cout<<"Not Leap Year";
	}
	return 0;
}
