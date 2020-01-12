#include <bits/stdc++.h>
using namespace std;


int main(){
	int T, num;
	std::cin >> T;
	while(true)
	{
		if(T==0)
			break;
		int NN, suma=0;
		std::cin >> NN;
		for(int i=0; i<NN; i++)
		{
			std::cin >> num;
			suma += num;
		}
		if(suma%NN==0)
			printf("YES\n");
		else
			printf("NO\n");
		T--;	
	}		
	return 0;
}
