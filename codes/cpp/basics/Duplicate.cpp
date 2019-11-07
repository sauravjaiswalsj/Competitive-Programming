#include<iostream>
#include<vector>
//#include<algorithm>
//using namespace std;
int main(void){
	int n,val;
	std::cin>>n;
	std::vector<int> list;
	for(int i=0;i<n;i++){
		std::cin>>val;
		list.push_back(val);
	}
	int flag=0;
	std::vector<int>::iterator it=list.begin();
	for(int i=0;i<n;i++){
		std::advance(it,i);
		for(int j=i+1;j<n;j++){
			if(list.at(i)==list.at(j)){
				flag++;
				list.erase(it);
				n--;
			}
		}
		std::advance(it,0);
	}
	if(flag>0){
		std::cout<<"yes";
	}
	else{
		std::cout<<"no";
	}
	std::cout<<"\n";
	for(int i:list)
		std::cout<<i<<" ";
}
