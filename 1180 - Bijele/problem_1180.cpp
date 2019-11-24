#include <bits/stdc++.h>
using namespace std;

int main(){
	int casos;
	std::cin >> casos;
	int array[6];
	int arraydef[6] = {1,1,2,2,2,8};
	for(int i=0; i<casos; i++)
	{
		string concatena = "";
		for(int j = 0; j<6; j++)
		{
			std::cin >> array[j];
		}
		for(int k=0; k<6; k++)
		{
			int num = arraydef[k] - array[k];
			concatena += std::to_string(num) + " ";
		}
		string subconcatena = concatena.substr(0,concatena.length()-1);
		printf("%s \n", subconcatena.c_str());
    }	
    
	return 0;
}
