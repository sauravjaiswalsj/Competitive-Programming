#include<iostream>
#include<vector>
#include<algorithm>
int main(){
	int n,t;
	std::cin>>n;
	std::vector<int> list;
	for(int i=0;i<n;i++){
		std::cin>>t;
		list.push_back(t);
	}
	sort(list.begin(),list.end());
	for(int i=0;i<n;++i){
		std::cout<<list.at(i)<<" ";
	}
	return 0;
}
