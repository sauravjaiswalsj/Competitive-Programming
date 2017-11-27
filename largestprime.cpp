#include<iostream>
using namespace std;

int main()
{
    long int n;
	cin>>n;
	cin.ignore();
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
				cout<<i<<"  ";	
		}
		
	}
	return 0;
}
