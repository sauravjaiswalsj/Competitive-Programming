#include<iostream>
using namespace std;

void mintime(){
	int n,temp;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	int min=a[0];

	for(int i=0;i<n;i++){
		if(min>a[i]){
			min=a[i];
		}
	}
	cout<<a[0]-min<<endl;
	
}

int main()
{
	int t;
	cin>>t;
	while(t!=0){
	mintime();
	t--;
	}
	return 0;
}
