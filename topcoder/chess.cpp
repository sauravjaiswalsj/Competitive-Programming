#include<iostream>
#include<string>
using namespace std;

class  BrokenChessboard{
	public:
    int minimumFixes(char* p){
        int count,sum;
	char *ptr=p;
        while(*ptr!='\0'){
	count=0;
	if(*ptr=='B'){
	    if(*ptr++=='W'){
		*ptr++;	
		}
	    else
		{
		count++;
		*ptr++;
      }
	sum=count;
    }	
  }
return sum;
}
};
int main(){
	  char str[50];
    	cin>>str;
    BrokenChessboard b;
   int k=b.minimumFixes(str);
	cout<<k;
return 0;
}
