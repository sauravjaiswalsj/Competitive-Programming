#include<bits/stdc++.h>
int main(){
	int n,m,a;
	std::cin>>n>>m>>a;
	int sides= ceil(n/a) * ceil(m/a);
	std::cout<<sides<<ceil(n/a);
	return 0;
}
