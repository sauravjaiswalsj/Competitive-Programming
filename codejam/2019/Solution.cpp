#include<iostream>
#include<chrono>

class jamCoins{
	public:
		jamCoins(long long jc,int i){
			long long a,b;
			if((jc%4!=0 && jc%2!=0)||(jc%4!=0 && jc%2==0)){
				a=jc/2;
				b=jc-a;
				 if(!modChecker(a,b)){
                                        a=jc/3;
                                        b=jc-a;
                                    
                                }	
			}
			else{
				if(jc%4==0 && jc %2==0){
				
					if(!modChecker(a,b)){
						a=jc-5;
						b=jc-a;
				
					}
					else{
						a=jc/4;
						b=jc-a;
				
					}
				}
			}	
			if(modChecker(a,b)){
                               	if(a+b==jc)
                                       	std::cout<<"Case #"<<i<<": "<<a<<" "<<b<<std::flush;
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
int main(){
	int t,i=1;
	std::cin>>t;
	while(t!=0){
		long long n;
		std::cin>>n;
		jamCoins j(n,i);
		if(t!=1){
			std::cout<<std::endl;
		}
		i++;
		t--;
	}
	return 0;
}

