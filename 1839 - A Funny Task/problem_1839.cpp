#include <bits/stdc++.h>
using namespace std;

int main(){
	int casos; 
	std::cin >> casos;
	for(int i = 0; i<casos; i++)
	{
		int N, TN=0; 
		std::cin >> N;
		for(int j=0; j<3; j++)
		{
			N = (2)*(N+3);
		}
		cout<<N;
		printf("\n");
	}
	return 0;
}
