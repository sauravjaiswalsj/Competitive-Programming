/*
1
3  5
7  9  11 
13 15 17 19
*/
#include<iostream>
using namespace std;
void pattern(int a){
		int i,j,s=1;
	
	for(i=1;i<=a;i++)
	{ int sum=0;
		for(j=1;j<=i;j++)
		{
			cout<<s<<" ";
		  s+=2;
		}
		cout<<"--"<<i*i*i<<endl;
		cout<<endl;
	}

	
}


int main()
{
	int n;
	cin>>n;
	pattern(n);
	return 0;
}
