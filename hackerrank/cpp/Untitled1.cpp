#include<iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	long int n;
	int i,j;
	cin>>n;
	long int a[n];
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	long int temp;
	for(i=0; i<n; i++){
	for(j=0; j<n; j++){
		if(a[i] > a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	}
	long int c=1;
	for(i=0;i<n;i++){
		if(a[i]==a[i+1])
		{
		c++;
		}
		else 
		break;
	}
	if(c>0)
	{
		cout<<c;
	
	}
	else{
		cout<<a[0];
	}
	return 0;
}
   

