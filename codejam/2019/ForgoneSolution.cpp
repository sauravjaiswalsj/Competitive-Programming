#include<iostream>

class jamcoins{
	public:
		jamcoins(long long jc, int i){
			long long a;
			long long b;
			if(jc%4!=0 && jc%2==0){
				a=jc/2;
				b=jc-a;
				std::cout<<"if1: "<<a<<b<<std::endl;
			}
			else if(jc%2!=0){
				if(modChecker(jc,jc)==true){
					a=jc/2;
					b=jc-a;
					std::cout<<"if2: "<<a<<b<<std::endl;
				
				if(modChecker(a,b)==false){
					int t=jc%10;
					a=jc-t;
					b=jc-a;
					}
				}
			}
			else if(jc%2!=0){
				a=(jc-1)/4;
				a=a+1;
				b=jc-a;
				std::cout<<"if3 :"<<a<<b<<std::endl;
			}
			else{	
				a=jc/4;
				b=jc-a;
				std::cout<<"if4: "<<a<<b<<std::endl;
			}
			
			if(modChecker(a,b)){
				if(a+b==jc)
					std::cout<<"Case #"<<i<<": "<<a<<" "<<b;
			}
		}
		bool modChecker(long long a,long long b){
			int i=1;
			while(a!=0 && b!=0){
				long long x=a%10;
				long long y=b%10;
				if(x==4 || y==4){
					return false;
					break;
				}
				a/=10;
				b/=10;
			}
			return true;
		}	
};
int main(void){
	int t,i=1;
	std::cin>>t;
	long long n;
	while(t!=0){
		std::cin>>n;
		jamcoins j(n,i);
		if(t!=1){
			std::cout<<"\n";
		}
		t--;
		i++;
	}
}
