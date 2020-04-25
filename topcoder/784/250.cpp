#include<bits/stdc++.h>

class Scissors{
	public:
		int openingTime(int N){
			int pair=1;
			int time=10;
			N=N-pair;
			pair=pair+1;
			for(int i=0;;i++){
				N=N-pair;
				pair+=2;
				time+=10;
				if(N<=pair && N!=0){
					time+=10;
					break;
				}
				if(N==0){
					break;
				}
			}
			return time;
		}
};

int main(void){
	int n;
	Scissors *p = new Scissors();
	std::cin>>n;
	int t=p->openingTime(n);
	std::cout<<t<<std::endl;
	return 0;
}


