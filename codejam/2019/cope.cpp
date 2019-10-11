#include<iostream>
class jamcoins{
	public:
		jamcoins(long long jc, int i){
			long long a=jc/4;
			long long b=jc-a;
			if(modChecker(a,b)){
				if(a+b==jc)
					std::cout<<"Case #"<<i<<": "<<a<<" "<<b<<"\n";
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
	long long arr[t];
	for(int i=0;i<t;i++){
		std::cin>>arr[i];
	}
	while(t!=0){
		long long n=arr[i-1];
		jamcoins j(n,i);
		t--;
		i++;
	}
}
