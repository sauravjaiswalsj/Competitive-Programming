#include<iostream>

using namespace std;

int main()
{
	int n,rev,num;
	cout<<"enter the number"<<endl;
	cin>>num; //5
	n=num*num;   //25
	cout<<"Square of "<<num<<"is "<<n<<"  "<<endl;
	int flag=0;
	while(n!=0)   //25 !=0       //n=25
	{
		if(num<10)  //5<10  //25<10    //n=5
		{
			rev=n%10;
	    	if(rev==num)
		  {
			flag=1;
			break;
		  }  
		}
		else if((num>=10)&&(num<100))
		{
		 rev=n%100;
	    	if(rev==num)
		  {
			flag=1;
			break;
		  }  
	   }
	   else 
	   {
	   	rev=n%1000;
	    	if(rev==num)
		  {
			flag=1;
			break;
		  }  
	   }
		n=n/10;
	}
	if(flag==1)
	{
		cout<<"automorphic no is  "<<rev<<endl;
	}
	else 
	{
		cout<<"Not automorphic"<<endl;
	}
	return 0;
}
