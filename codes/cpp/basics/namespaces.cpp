#include<iostream>
#include<bits/stdc++.h>
namespace saurav{
	int sj=10;
	int saurav(){
		return sj;
	}
}
namespace hello{
	class geek{
		int d=20;
	public:
		void geeqk(){
			std::cout<<"hello"<<d<<std::endl;
		}
	};
}
int main(){
	std::cout<<saurav::saurav()<<"\n";
	hello::geek *ob=new hello::geek();
	ob->geeqk();
	delete ob;
	ob->geeqk();
	return 0;
}
