#include<iostream>
#include<math.h>
using namespace std;
class palin{
	public:
	void even_palindrome(int num){
		int sum=2*(pow(10,num/2)-1);
		cout<<sum;		
	}
	void odd_palindrome(int num){
	
	}

};
int main(){
	int n,num;
	cin>>n>>num;
	palin geti;
	while(n!=0){
		if(num%2==0){
			geti.even_palindrome(num);
		}
		else{
			geti.odd_palindrome(num);
		}
		n--;
	}
return 0;
}
