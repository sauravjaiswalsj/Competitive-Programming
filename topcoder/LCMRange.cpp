#include<iostream>
#include<bits/stdc++.h>
class LCMRange{
	public:
	int lcm(int f, int l){
		int lcm=1;
		for(int i=f;i<=l;i++){
			lcm=lcm*(i/gcd(lcm,i));
		}
		return lcm;
	}
	int gcd(int a,int b){
		while(b>0){
			int t=b;
			b=a%b;
			a=t;
		}
		return a;
	}
};
int main(){
	int f,l;
	std::cin>>f>>l;
	LCMRange *get =new LCMRange();
	std::cout<<get->lcm(f,l);
	return 0;
}
