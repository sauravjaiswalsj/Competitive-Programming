#include<iostream>
using namespace std;

class Gbus{
	public:
	int gbus,no_cities;
      	 int a[],b[],c[];
	public:
	void count(){
		//no of gbus
		cin>>gbus;
		int a[gbus],b[gbus];
		for(int i=0;i<gbus; i++){
			cin>>a[i]>>b[i];
		}	
		cin>>no_cities;
		int c[no_cities];
		for(int i=0;i<no_cities;i++){    
			cin>>c[no_cities];
		}
	}

class countable : public Gbus{
public:	int count_bus(){
    for(int i=0;i<gbus; i++){
                        cout<<a[i]<<"   "<<b[i]<<"   "<<c[i]<<endl;
                }
		int cnt,j=0;
		while(j<no_cities){
			for(int i=0; i<gbus; i++){
				 if((c[j]>=a[i])&&(c[j]<=b[i])){
					cnt++;
				}
			}
			cout<<cnt<<"  ";
			return cnt;
			j++;
			cnt=0;
		}
	}
};

int main(){
	int n;
	countable get;
	cin>>n;
	while(n!=0){
	get.count();
	cout<<"Case #"<<n<<": ";
	cout<<get.count_bus()<<endl;
	cout<<endl;
	n--;
	}
	return 0;
}
