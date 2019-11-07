#include<iostream>
#define String std::string
class vowels{
	public:
	bool vowel(char c){
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			return true;
		}else{
			return false;
		}
	}
};

int main(){
	vowels *v =new vowels();
	String str;
	std::getline(std::cin,str);
	int i=0;
	std::cout<<str<<"\n";
	while(str[i]!='\0'){
		if(v->vowel(std::tolower(str[i]))){
				std::cout<<str[i]<<" is vowel \n";
		}
		i++;
	}
	
	delete v;
}

