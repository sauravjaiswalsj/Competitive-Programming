#include<iostream>
using namespace std;
int main()
{
int a=0;
int b=1;
int sum,add=0;

for(int i=1;i<=32;i++)
{
	sum=a+b;
	cout<<sum<<" ";
	if(sum%2==0)
	{
		add=add+sum;
	}
	a=b; 
	b=sum;
	}
	cout<<endl<<"Sum = "<<add;	
	return 0;
}

