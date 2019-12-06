#include <bits/stdc++.h>
using namespace std;

int main(){
	int T; 
	std::cin >> T;
	for(int i=0; i<T; i++)
	{
		string c;
		std::cin >> c;
		if(c.at(c.length()-1) == '0' || c.at(c.length()-1) == '5')
			printf("YES\n");
		else
			printf("NO\n");
	}
	
	return 0;
}
