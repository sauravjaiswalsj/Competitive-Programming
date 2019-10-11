#include<iostream>
using namespace std;
int binarySearch(int A[],int n,int x){
	int start=0;
	int end=n-1;
	while(start<=end){
		int mid=(start+end)/2;
		if(A[mid]==x){
			return mid;
		}
		else if(x>A[mid]){
			start=mid+1;
		}
		else{
			end=mid-1;
		}
	}
	return -1;
}
int main(){
	int n,result;
	cin>>n;
	int A[n];
	for(int i=0;i<n;i++){
		cin>>A[i];
	}
	int x;
	cin>>x;
	result=binarySearch(A,n,x);
	if(result==-1){
		x++;
		result=binarySearch(A,n,x);
		cout<<"No "<<result+1;
	}
	else{
		cout<<"Yes "<<result+1;
	}
	return 0;
}
