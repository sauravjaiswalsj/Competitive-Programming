#include<iostream>
class check{
	int v=20;
	public:
	void gcheck(){
		std::cout<<v<<std::endl;
	}
};
int main(){
	check *ob=new check();
	ob->gcheck();
	delete ob;
	ob->gcheck();
	return 0;
}

