#include<bits/stdc++.h>
using std::cin;
using std::cout;
using std::vector;
using std::string;
using std::endl;
/*******  All Required define Pre-Processors and typedef Constants *******/
#define SCI(t) scanf("%d",&t)
#define SCLI(t) scanf("%ld",&t)
#define SCLLI(t) scanf("%lld",&t)
#define SCC(t) scanf("%c",&t)
#define SCS(t) scanf("%s",t)
#define SCF(t) scanf("%f",&t)
#define SCD(t) scanf("%lf",&t)
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


int main(void){
	int a;
	long b;
	char c;
	float d;
	double e;
	//Type your code here
	SCI(a);
	SCLI(b);
	fflush(stdin);
	SCC(c);
	fflush(stdin);	
	SCF(d);
	SCD(e);
	printf("%d\n%ld\n%c\n%f\n%lf",a,b,c,d,e);
	return 0;
}

