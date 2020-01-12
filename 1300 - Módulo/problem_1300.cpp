#include <cstdio>
#include <bits/stdc++.h>
using namespace std;

int main(){
	int V [10], n, x=0, con = 1;
	for(int i=0; i<10; i++)
	{
		std::cin >> n;
		V[i] = n%42;
	}
	int size = sizeof(V)/sizeof(V[0]);
	sort(V, V+size);
	for(int i=0; i<10; i++)
	{
		if(V[x]!=V[i])
		{
			con++;
			x=i;
		}
	}
	cout << con;
	return 0;
}
