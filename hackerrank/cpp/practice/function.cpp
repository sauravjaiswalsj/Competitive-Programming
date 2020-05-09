#include<bits/stdc++.h>
using std::cin;
using std::cout;
using std::vector;
using std::string;
using std::endl;
/*******  All Required define Pre-Processors and typedef Constants *******/
#define SCD(t) scanf("%d",&t)
#define SCLD(t) scanf("%ld",&t)
#define SCLLD(t) scanf("%lld",&t)
#define SCC(t) scanf("%c",&t)
#define SCS(t) scanf("%s",t)
#define SCF(t) scanf("%f",&t)
#define SCLF(t) scanf("%lf",&t)
#define MEM(a, b) memset(a, (b), sizeof(a))
#define FOR(i, j, k, in) for (int i=j ; i<k ; i+=in)
#define RFOR(i, j, k, in) for (int i=j ; i>=k ; i-=in)
#define REP(i, j) FOR(i, 0, j, 1)
#define RREP(i, j) RFOR(i, j, 0, 1)
#define all(cont) cont.begin(), cont.end()
#define rall(cont) cont.end(), cont.begin()
#define FOREACH(it, l) for (auto it = l.begin(); it != l.end(); it++)
#define IN(A, B, C) assert( B <= A && A <= C)
#define MP make_pair
#define PB push_back
#define INF (int)1e9
#define EPS 1e-9
#define PI 3.1415926535897932384626433832795
#define MOD 1000000007
#define read(type) readInt<type>()
const double pi=acos(-1.0);
typedef long int int32;
typedef unsigned long int uint32;
typedef long long int int64;
typedef unsigned long long int  uint64;

int greater(int a,int b,int c,int d){
	int max=a;
	if(b>max){
		max=b;
	}
	if(c>max){
		max =c;
	}
	if(d>max){
		max=d;
	}
	return max;

}
int main(void){
	
	//Type your code here
	int a,b,c,d;
	cin>>a>>b>>c>>d;
	cout<<greater(a,b,c,d)<<"\n";
	return 0;
}

