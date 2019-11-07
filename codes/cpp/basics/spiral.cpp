#include<bits/stdc++.h>
//k=row
//l=col
int reverseSpiral(int m,int n, int arr[][]){
	int i;
	int k=m-1;
	int l=n-1;
	while(k>-1 && l>-1){
		for(int i=k;i>-1;i--){
			std::cout<<arr[k][i];
		}
		for(int i=l-1;i>-1;i--){
			std::cout<<arr[l][i];
		}
	}

}
int main(){
	int m,n;
	std::cin>>m>>n;
	int arr[m][n];
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			std::cin>>arr[i][j];
		}
	}
	std::cout<<reverseSpiral(m,n,arr);
}
