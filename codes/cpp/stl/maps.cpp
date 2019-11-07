#include<iostream>
#include<map>
#include<algorithm>
int main(){
	int n,t;
	std::cin>>n;
	std::string s;
	std::map<std::string, int> maps;
	for(int i=0;i<n;i++){
		std::getline(std::cin,s);
		std::cin>>t;
		maps.insert(s,t);
	}
	for(auto it=maps.begin();it!=maps.end();++it){
		std::cout<<(*it).first<<" "<<(*it).second<<std::endl;
	}
	return 0;
}
