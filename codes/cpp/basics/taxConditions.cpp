#include<iostream>
#define MIN1 150001
#define MAX1 300000
#define RAT1 0.10
#define MIN2 300001
#define MAX2 500000
#define RAT2 0.20
#define MIN3 500001
#define RAT3 0.30
int main(){
	double income,t_income;
	std::cout<<"Enter your income: ";
	std::cin>>income;
	t_income=income-MIN1;
	std::cout<<"Income After tax Deduction"<<std::endl;
	if(t_income>= MIN3){
		t_income=RAT3*(t_income-MIN3);
	}
	else if(t_income>=MIN2 && t_income<=MAX2){
		t_income=RAT2*(t_income-MIN2);
	}
	else if(t_income>=MIN1 && t_income<=MAX1){
		t_income=RAT1*(t_income-MIN1);
	}
	else{
		t_income=income;
		std::cout<<"No tax\n";
	}
	std::cout<<"Your income is: "<<income-t_income<<std::endl;
	return 0;
}
