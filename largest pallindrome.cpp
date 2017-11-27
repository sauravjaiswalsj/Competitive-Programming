/*
Largest palindrome product
Problem 4 

A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/
#include<iostream>
using namespace std;
int main()
{
int sum,n,r,rev=0;
	int i=90;
	while(i<100)
	{
		sum=99*i;
		n=sum;
		while(sum!=0)
		{
			r=sum%10;
			rev=rev*10+r;
			sum=sum/10;	
		}
		if(rev==n)
			{
				cout<<"i*99"<<endl<<n;
			
			}

		i++;	
	}
	return 0;
}
