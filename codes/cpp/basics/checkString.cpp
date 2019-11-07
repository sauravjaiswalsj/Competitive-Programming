#include<iostream>
#include<string.h>

class findLen{
	private: 
		std::string st;
		int tLen,sLen;
	public:
	int findLength(std::string s,std::string t){
		sLen=s.size();
		tLen=t.size();
		if(t.compare(s)==0){
			for(int i=0;i<sLen;i++){
				st=t.substr(0,tLen);
				if(s.find(st)){
					if(st.size()==2){
						break;
					}
				}
				tLen--;
			}
		}
		else{
			return -1;
		}
		return st.size();
	}
};
int main(){
	std::string s;
	std::string t;
	std::getline(std::cin,s);
	std::getline(std::cin,t);
	findLen *get=new findLen();
	std::cout<<get->findLength(s,t);
	delete get;
	get->findLength("hello","world");
}
