#include<stdio.h>
#include<math.h>
void primeFact(long);
int main(void){
	long n;
	printf("Enter the Number to find the primeFactors:  ");
	scanf("%ld",&n);
	primeFact(n);

}
void primeFact(long n){
	int count;
	for(long i=2;i<=sqrt(n);i++){
		if(n%i==0){
			count=0;
			while(n%i==0){
				n/=i;
				count++;
				printf("%ld\n",i);
				
			}
		}
	}
	if(n!=1){
		printf("%ld",n);
	}
}
