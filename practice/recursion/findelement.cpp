#include<bits/stdc++.h>
bool check(int arr[],int n,int x){
	if(n==0)
		return 1;
	std::cout<<arr[n-1]<<" ";
	bool ck=check(arr,n-1,x);
	if(x==arr[n-1])
		return true;
	return ck;
}
int main(){
	int arr[] ={1,2,3,4,5};
	std::cout<<check(arr,5,2);
}

