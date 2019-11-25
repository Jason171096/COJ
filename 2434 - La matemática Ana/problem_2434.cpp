#include <bits/stdc++.h>
#include <math.h> 
using namespace std;

bool primo(long long n)
{
	for(int i = 2; i<=sqrt(n); i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}

long long primorial(long long n)
{	
	if(n==2)
		return 2;
	bool respuesta = primo(n);
	if(respuesta)
		return n*primorial(n-1);
	return primorial(n-1);
}

int main(){
	long long num;
	while((std::cin >> num))
	{
		if(num == 0)
			break;
		printf("%I64u", primorial(num));
		printf("\n"); 
	}
	return 0;
}
