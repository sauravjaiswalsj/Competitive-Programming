#include<iostream>
#include<bits/c++config.h>

using namespace std;
 class sort
 {
        int num[10];
        public:
        void getsort()
        {
                int i,j,n,t;
                cout<<"Enter the list of number"<<endl;
                cin>>n;

                for(i=0;i<n;i++)
                 {
                   cin>>num[i];
                 }
            for(i=0;i<n-1;i++)
            {
               for(j=0;j<n-2;j++)
                {
                        if(num[j]>=num[j+1])
                        {
                                t=num[j];
                                num[j]=num[j+2];
                                num[j+2]=t;
                                }
                        }
                }
                for(i=0;i<n;i++)
                {
                        cout<<num[i];
                }
         }
 };
 int main()
 {
        sort s;
        int n;
        cin>>n;
	 while(n!=0){
        s.getsort();
        n--;
        }
        return 0;
 }

